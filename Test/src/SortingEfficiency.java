import java.util.ArrayList;
import java.util.Collections;

public class SortingEfficiency {

	public static void main(String[] args)
	{
		double start = 0, end = 0;
		double sum = 0;
		int trials = 10;
		for(int t=0; t<trials; t++)
		{
			ArrayList<Integer> list = new ArrayList<Integer>();
			int numElements = 35000;
			for(int i=0; i<numElements; i++)
			{
				list.add((int)(Math.random()*100));
			}
		
		
			start = System.currentTimeMillis();
			for(int i=0; i<numElements; i++)
			{
				for(int a=i+1; a<numElements; a++)
				{
					if(list.get(i) > list.get(a))
					{
						int temp = list.get(a);
						list.set(a, list.get(i));
						list.set(i, temp);
					}
				}
				
			}
			end = System.currentTimeMillis();
			sum = sum + (end - start);
			System.out.println("Trial "+(t+1)+" time = "+(end-start));
		}
		System.out.println("Average = "+sum/trials);
	}
}
