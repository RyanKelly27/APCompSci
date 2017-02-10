
public class MergeSort {

	 /**
     * This is the publicly accessible mergeSort method. It will sort the
     * array data into least to greatest order.
 	 * @param data the array to be sorted
	 */
	public static void mergeSort(int [ ] data)
	{
		int[] temp = new int[data.length];
		mergeSort(data, temp,  0,  data.length - 1);
	}

	 /**
		 * This is the private, recursive mergeSort method. It will use the 
		 * mergeSort algorithm to sort data into least to greatest order.
		 * @param data the array to be sorted
		 * @param temp a holding array, used in merging then discarded
		 * @param start the leftmost index of the portion of the array to sort
		 * @param end the rightmost index of the portion of the array to sort
		 */
		private static void mergeSort(int [ ] data, int [ ] temp, int start, int end)
		{
			if( start < end )
			{
				int mid = (start + end) / 2;
				mergeSort(data, temp, start, mid);
				mergeSort(data, temp, mid + 1, end);
				merge(data, temp, start, mid, end);
			}
		}

		/**
		 * The private merge method. It takes to already sorted (and adjacent)
		 * array segments and combines them into one sorted segment.
		 * @param data the array to be merged
		 * @param temp temporary holding array to be used and discarded
		 * @param start the index of the start of left hand segment
		 * @param mid the index of the end of the left hand segment
		 * @param end the end of the right hand segment
		 */
	    private static void merge(int[ ] data, int[ ] temp, int start, int mid, int end )
	    {
	        // You may or may not find it useful to define these variables
	        int left = start;
	        int leftEnd = mid;
	        int right = mid+1;
	        int rightEnd = end;
	        int index = start;
	        
	        while(left <= leftEnd && right <= rightEnd)
	        {
	        	if(data[left] < data[right])
	        	{
	        		temp[index] = data[left];
	        		left++;
	        		index++;
	        	}
	        	else
	        	{
	        		temp[index] = data[right];
	        		right++;
	        		index++;
	        	}
	        }
	       
	        while(left <= leftEnd)
	        {
	        	temp[index] = data[left];
	        	left++;
	        	index++;
	        }
	        
	        while(right <= rightEnd)
	        {
	        	temp[index] = data[right];
	        	right++;
	        	index++;	        
	        }
	       
	        for(int i=start; i<=end; i++)
	        {
	        	data[i] = temp[i];
	        }
	     }
	    
	    public static void main(String[] args)
		{
	                int numElements = 20;
	                int[] data = new int[numElements];
	                System.out.println("Original Order:");
	                for(int i=0; i<numElements; i++)
	                {
	                     data[i] = (int)(Math.random()*100+1);
	                     System.out.print(data[i] + " ");
	                }
	                System.out.println("\nSorted Order:");
	                mergeSort(data);
	                for(int t : data)
	                {
	                     System.out.print(t + " ");
	                }
	        }

}
