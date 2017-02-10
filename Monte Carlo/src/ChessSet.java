import java.util.ArrayList;
import java.util.Random;

public class ChessSet
{
	static ArrayList <String> set;
	static Random generator = new Random();
	
	public ChessSet()
	{
		set = new ArrayList<String>();
		for(int i=0; i<8; i++)
		{
			set.add("White Pawn");
			set.add("Black Pawn");
		}
		for(int i=0; i<2; i++)
		{
			set.add("White Rook");
			set.add("Black Rook");
			set.add("White Bishop");
			set.add("Black Bishop");
			set.add("White Knight");
			set.add("Black Knight");
		}
		set.add("White Queen");
		set.add("Black Queen");
		set.add("White King");
		set.add("Black King");
	}
	
	// Returns one randomly selected piece from the set
	// and removes it from the pool of available pieces
	public String removePiece() 
	{ 
		int index = (int)(Math.random()*set.size());
		return set.remove(index);
	}
	
	
	// Returns one randomly selected piece from the set
	// without removing it from the pool of available pieces
	public String getPiece() 
	{ 
		int index = (int)(Math.random()*set.size());
		return set.get(index);
	}
	
	
	// Returns n (n²32) randomly selected pieces from the 
	// chess set without replacing any pieces selected
	public ArrayList<String> removeNPieces(int n) 
	{ 
		ArrayList<String> chessPieces = new ArrayList();
		for(int i=0; i<n; i++)
		{
			int num = generator.nextInt(set.size()-1);
			chessPieces.add(set.get(num));
			
			set.remove(num);
		}
		
		return chessPieces;
	} 
	
	
	// Returns n (n²32) randomly selected pieces from the 
	// chess set, replacing each one before drawing another
	public ArrayList<String> getNPieces(int n) 
	{
		ArrayList<String> chessPieces = new ArrayList();
		for(int i=0; i<n; i++)
		{
			int num = generator.nextInt(set.size()-1);
			chessPieces.add(set.get(num));
		}
		
		return chessPieces;
	}
	
	
	public static void main(String[] args)
	{
		ChessSet chessSet = new ChessSet();
		ChessSet intitalTest = new ChessSet();
		
		
		//Test removePiece Method
		//String chessPiece = removePiece();
		System.out.println("Removed Chess Piece: "+intitalTest.getPiece());
		System.out.println("\n");
		
		///Test getPiece Method
		System.out.println("Chess Piece: "+intitalTest.removePiece());
		System.out.println("\n");
		
		//Test removeNPieces Method
		System.out.println("Removed Chess Pieces: "+intitalTest.removeNPieces(5));
		System.out.println("\n");
		
		//Test getNPieces
		System.out.println("Chess Pieces: "+intitalTest.getNPieces(5));
		System.out.println("\n");
		
		//Question 1
		String temp = new String();
		int count = 0;
		for(int i=0; i<100; i++)
		{
			temp = chessSet.getPiece();
			if(temp == "Black Pawn")
			{
				count++;
			}
		}
		double percent = (count/100.0) * 100.0;
		System.out.println("\n Number of Black Pawns: "+count+"\n Probability: "+count+"/100, "+percent+"%");
		
		//Question 2
		count = 0;
		for(int i=0; i<100; i++)
		{
			ArrayList<String> tempList = new ArrayList<String>();
			ChessSet question2 = new ChessSet();
			for(int a=0; a<5; a++)
			{
				tempList = question2.removeNPieces(5);
				if(tempList.get(a) == "Black Pawn" || tempList.get(a) == "White Pawn")
				{
					count++;
					break;
				}
			}
		}
		percent = (count/100.0) * 100.0;
		System.out.println("\n Number of pawns: "+count+"\n Probability: "+count+"/100, "+percent+"%");
		
		//Question 3
				count = 0;
				for(int i=0; i<100; i++)
				{
					ArrayList<String> tempList = new ArrayList<String>();
					ChessSet question3 = new ChessSet();
					for(int a=0; a<5; a++)
					{
						tempList = question3.getNPieces(5);
						if(tempList.get(a) != "Black Pawn" && tempList.get(a) != "White Pawn")
						{
							count++;
							break;
						}
					}
				}
				percent = (count/100.0) * 100.0;
				System.out.println("\n Number of non-pawns: "+count+"\n Probability: "+count+"/100, "+percent+"%");
		
		
		
	}
}
