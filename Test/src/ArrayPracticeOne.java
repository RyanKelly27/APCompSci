public class ArrayPracticeOne 
{
	public static void main(String[] args)
	{
		int numElements = 10;
		int[] data = new int[numElements];
		
		// Put random values from 1-100 in the array
		for(int i=0; i<numElements; i++)
		{
			data[i] = (int)(Math.random()*100+1);
		}
		
		// Display the unsorted array
		System.out.println("Unsorted:");
		for(int i=0; i<numElements; i++)
		{
			System.out.print(data[i]+" ");
		}
		System.out.println();
		
		/*
		 * Put code here to reverse the elements in the array.
		 * Note this means actually reversing the elements, not
		 * just printing them in reverse order.
		 */
		for(int i=0; i<5; i++)
		{
			int a = 9 - i;
			int temp = data[a];
			data[a] = data[i];
			data[i] = temp;
		}
		
		
		// Display the now sorted array
		System.out.println("With elements reversed:");
		for(int i=0; i<numElements; i++)
		{
			System.out.print(data[i]+" ");
		}
		System.out.println();
		
		
		/*
		 * Put code here to sort the array into least to greatest order
		 */
		for(int i=0; i<numElements; i++)
		{
			for(int a=i+1; a<numElements; a++)
			{
				if(data[i] > data[a])
				{
					int temp = data[a];
					data[a] = data[i];
					data[i] = temp;
				}
			}
			
		}
		
		
		// Display the now sorted array
		System.out.println("Sorted least to greatest:");
		for(int i=0; i<numElements; i++)
		{
			System.out.print(data[i]+" ");
		}
		System.out.println();
		
	}
}