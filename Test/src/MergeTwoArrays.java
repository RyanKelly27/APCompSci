public class MergeTwoArrays 
{
	public static void main(String[] args)
	{
		int numElements = 10;
		int[] dataA = new int[numElements];
		int[] dataB = new int[numElements];
		for(int x=0; x<numElements; x++)
		{
			dataA[x] = (int)(Math.random()*50+1)*2;
			dataB[x] = (int)(Math.random()*50)*2+1;
		}
		
		// Print out the two arrays
		for(int x=0; x<numElements; x++)
		{
			System.out.print(dataA[x]+"\t");
		}
		System.out.println();
		for(int x=0; x<numElements; x++)
		{
			System.out.print(dataB[x]+"\t");
		}
		
		// Put code here to merge the two arrays into one
		// array, with the first element being the first 
		// element of dataA, the second is the first element
		// of dataB, the third element is the second element
		// of dataA, the fourth is the second element of 
		// data, and so on. Then have your program print out
		// the new array to verify that it works. 
		
		numElements = 20;
		int[] dataC = new int[numElements];
		int a = 0;
		for(int x=0; x<numElements; x++)
		{
			if(x%2==0)
			{
				dataC[x] = dataA[a];
			}
			else
			{
				dataC[x] = dataB[a];
				a++;
			}
		}
		
		System.out.println();
		for(int x=0; x<numElements; x++)
		{
			System.out.print(dataC[x]+"\t");
		}
	}
}
