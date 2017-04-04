
public class Position {

	private int list[][];
	
	public Position()
	{
		int list[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
		//Repeatedly getting null error.
		//When establishing a new Position variable, the list array is null, why?
	}
	
	
	/*
	 * Checks to see if the next letter selection is valid or not.
	 * If it is, return true.
	 * If not, return false.
	 */
	public boolean checkIfValid(int a, int b)
	{
		return false;
	}
	
	
	//Prints out all the elements in the matrix.
	public void printMatrix()
	{
		for(int i=0; i<4; i++)
		{
			for(int a=0; a<4; a++)
			{
				System.out.print(list[i][a] +" ");
			}
			System.out.println("\n");
		}
	}
	
	
	public static void main(String[] args)
	{
		Position newList = new Position();
		
		newList.printMatrix();
	}
	
	/** List of must needs
	 * 
	 * 1) The same letter can't be picked twice in one word.
	 * 	EX. spot 3 picked twice in one word.
	 * 
	 * 2) The next letter must be adjacent.
	 * 	EX. If spot 1 is chosen, spot 16 can't be chosen next.
	 * 
	 * 	How to incorporate these needs?
	 * 
	 * 1) T
	 * 
	 */
	
}
