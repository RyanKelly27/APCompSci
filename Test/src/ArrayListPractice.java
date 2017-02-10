import java.util.ArrayList;

public class ArrayListPractice 
{
	public static void main(String[] args)
	{
		int numElements = 10;
		ArrayList<Integer> data = new ArrayList<Integer>();
		
		// Put random values from 1-100 in the array
		for(int i=0; i<numElements; i++)
		{
			data.add((int)(Math.random()*100+1));
		}
		
		// Display the unsorted ArrayList
		System.out.println("Unsorted:");
		for(int i=0; i<numElements; i++)
		{
			System.out.print(data.get(i)+" ");
		}
		System.out.println();
		
		/*
		 * Put code here to reverse the elements in the ArrayList.
		 * Note this means actually reversing the elements, not
		 * just printing them in reverse order.
		 */
		for(int i=0; i<numElements/2; i++)
		{
			int a = (numElements-1) - i;
			int temp = data.get(i);
			data.set(i, data.get(a));
			data.set(a, temp);
		}
		
		
		// Display the now reversed ArrayList
		System.out.println("With elements reversed:");
		for(int i=0; i<numElements; i++)
		{
			System.out.print(data.get(i)+" ");
		}
		System.out.println();
		
		
		/*
		 * Put code here to sort the ArrayList into least to greatest order
		 */
		for(int i=0; i<numElements; i++)
		{
			for(int a=i+1; a<numElements; a++)
			{
				if(data.get(i) > data.get(a))
				{
					int temp = data.get(a);
					data.set(a, data.get(i));
					data.set(i, temp);
				}
			}
			
		}
		
		// Display the now sorted ArrayList
		System.out.println("Sorted least to greatest:");
		for(int i=0; i<numElements; i++)
		{
			System.out.print(data.get(i)+" ");
		}
		System.out.println();
		
	}
}