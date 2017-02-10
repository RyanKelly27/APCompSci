public class FindTheLargest 
{
	public static void main(String[] args)
	{
		int numElements = 50;
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
			if(i%10==0)
				System.out.println();
			System.out.print(data[i]+"\t");
			
		}
		System.out.println();
		
		
		/*
		 * Put code here to find the index of the largest element
		 * in the array.
		 */
		
		int indexOfLargest = 0;
		int temp = data[0];
		for(int i=1; i<numElements; i++)
		{
			if(temp < data[i])
			{
				temp = data[i];
				indexOfLargest = i;
			}
		}
		
		System.out.println("Largest = " + data[indexOfLargest]);
	}
		
}