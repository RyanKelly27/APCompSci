import java.util.ArrayList;

public class FreeResponseFeb9 {

	// precondition: words is not empty
	// postcondition: all Strings in words that being with the
	//   specified character have been removed from words
	public static void removeWordsThatStartWith(ArrayList<String> words, char letter)
	{
		for(int i=0; i<words.size();)
		{
			if(words.get(i).charAt(0) == letter)
				words.remove(i);
			else
				i=i+1;
		}
	}
	
	public static void main(String[] args)
	{
		ArrayList words = new ArrayList();
		words.add("Ryan");
		words.add("Hello");
		words.add("Goodbye");
		words.add("Running");
		words.add("Rory");
		words.add("NotRory");
		words.add("Word");
		words.add("Robot");
		
		removeWordsThatStartWith(words, 'R');
		
		for(int i=0; i<words.size(); i++)
		{
			System.out.println(words.get(i));
		}
	}
}
