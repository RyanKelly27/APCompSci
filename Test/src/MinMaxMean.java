// Write the code to make each of the methods
// work as specified.

public class MinMaxMean 
{
	public static void main(String[] args)
	{
		int numElements = 10;
		int[] numbers = new int[numElements];
		for(int i=0; i<numElements; i++)
		{
			numbers[i] = (int)(Math.random()*100+1);
		}

                for(int i=0; i<numElements; i++)
                {
                        System.out.print(numbers[i]+"\t");
                }
                System.out.println();
		
		System.out.println("Minimum = " + minimum(numbers));
		System.out.println("Maximum = " + maximum(numbers));
		System.out.println("   Mean = " + mean(numbers));
	}
	
	/**
	 * Finds and returns the maximum value in an
	 * array of integers. 
	 * @param data the numbers to examine
	 * @return the max value in the array
	 */
	public static int maximum(int[] data)
	{
		int firstIndex = 0;
		for(int i=1; i<data.length; i++)
		{
			if(data[firstIndex] < data[i])
				firstIndex = i;
		}
		return data[firstIndex];
	}
	
	/**
	 * Finds and returns the minimum value in an
	 * array of integers. 
	 * @param data the numbers to examine
	 * @return the minimum value in the array
	 */
	public static int minimum(int[] data)
	{
		int firstIndex = 0;
		for(int i=1; i<data.length; i++)
		{
			if(data[firstIndex] > data[i])
				firstIndex = i;
		}
		return data[firstIndex];
	}
	
	/**
	 * Calculates and returns the mean 
	 * of the values in an array of integers. 
	 * @param data the numbers to examine
	 * @return the max value in the array
	 */
	public static double mean(int[] data)
	{
		int temp = 0;
		for(int i=0; i<data.length; i++)
		{
			temp = temp + data[i];
		}
		double mean = temp/10.0;
		return mean;
	}
}