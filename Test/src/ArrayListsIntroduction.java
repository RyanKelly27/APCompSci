import java.util.ArrayList;

public class ArrayListsIntroduction {

	public static void main(String[] args)
	{
		ArrayList<String> words = new ArrayList<String>( );
		
		words.add("Lucas");
		words.add("Simon");
		words.add("John");
		words.add("Tommy");
		words.add("Sana");
		words.add("Delaney");
		words.add("Ellie");
		words.add("Janelle");
		
		for(String temp: words)
		{
			System.out.print(temp+" ");
		}
		
		words.add("Megan");
		System.out.println();
		
		for(String temp: words)
		{
			System.out.print(temp+" ");
		}
		
		words.remove(3);
		System.out.println();
		
		for(String temp: words)
		{
			System.out.print(temp+" ");
		}
		
		words.add("Leah");
		System.out.println();
		
		for(String temp: words)
		{
			System.out.print(temp+" ");
		}
		
		words.add(2, "Ryan");
		System.out.println();
		
		for(String temp: words)
		{
			System.out.print(temp+" ");
		}
		
		words.set(2,  "Katherine");
		System.out.println();
		
		for(String temp: words)
		{
			System.out.print(temp+" ");
		}
		
		String tempList;
		for(int i=0; i<words.size()/2; i++)
		{
			int a = (words.size() -1) - i;
			tempList = words.get(i);
			words.set(i, words.get(a));
			words.set(a, tempList);
		}
		System.out.println();
		
		for(String temp: words)
		{
			System.out.print(temp+" ");
		}
	}
}
