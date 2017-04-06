import java.awt.Button;
import java.util.ArrayList;


public class Position extends BoggleGUI {

	public static ArrayList<Button> buttons = new ArrayList<Button>();
	
	public Position()
	{
		buttons.add(letter0);
		buttons.add(letter1);
		buttons.add(letter2);
		buttons.add(letter3);
		buttons.add(letter4);
		buttons.add(letter5);
		buttons.add(letter6);
		buttons.add(letter7);
		buttons.add(letter8);
		buttons.add(letter9);
		buttons.add(letter10);
		buttons.add(letter11);
		buttons.add(letter13);
		buttons.add(letter14);
		buttons.add(letter15);
	}
	
	public static void removeInvalidChoices(int num)
	{
		if(num == 0)
		{
			buttons.get(2).disable();
			buttons.get(3).disable();
			buttons.get(6).disable();
			buttons.get(7).disable();
			buttons.get(8).disable();
			buttons.get(9).disable();
			buttons.get(10).disable();
			buttons.get(11).disable();
			buttons.get(12).disable();
			buttons.get(13).disable();
			buttons.get(14).disable();
			buttons.get(15).disable();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*	private int list[][];
	
	public Position()
	{
		int list[][] = {{0, 1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11}, {12, 13, 14, 15}};
		//Repeatedly getting null error.
		//When establishing a new Position variable, the list array is null, why?
	}
	
	
	
	 * Checks to see if the next letter selection is valid or not.
	 * If it is, return true.
	 * If not, return false.
	 
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
	*/
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
