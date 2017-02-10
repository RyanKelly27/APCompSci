import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args)
	{
		TreeSet<Integer> set = new TreeSet<Integer>();
		int numElements = 20;
		for(int i=0; i<numElements; i++)
		{
			int temp = (int)(Math.random() * 1000) + 100;
			set.add(new Integer(temp));
		}
		for(Integer temp: set)
		{
			System.out.println(temp);
		}
		
		//Task 1b - Print everything less than 500.
		System.out.println("\nEverything less than 500");
		System.out.println(set.headSet(500));
		
		//Task 1c - Pull the three highest values, then reprint the set.
		System.out.println("\nThe three highest values:");
		for(int i=0; i<3; i++)
		{
			System.out.println(set.pollLast());
		}
		System.out.println("\nThe remaining values:");
		for(Integer temp: set)
		{
			System.out.println(temp);
		}
		
		//Task 1d - Print out the elements between 250 and 750
		System.out.println("\nEverything between 250 and 750");
		System.out.println(set.subSet(250, 750));
		
		//Task 1e - Print out the remaining elements in reverse order
		System.out.println("\nThe elements in reverse order:");
		System.out.println(set.descendingSet());
	}
}