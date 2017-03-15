import java.util.ArrayList;
import java.util.Collections;

public class SortTimerBeta 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list;
		double start, end;
		
		//for(int numElements = 5000; numElements<=100000; numElements+=5000)
		{
			int numElements = 500000;
			double totalTime = 0;
			for(int n=0; n<10; n++)
			{
				list = new ArrayList<Integer>();
				for(int i=0; i<numElements; i++)
				{
					list.add((int)(Math.random()*100));
				}
				
				start = System.currentTimeMillis();
				//Collections.sort(list);
				for(int a=0; a<numElements; a++)
				{
					for(int b=a+1; b<numElements; b++)
					{
						if(list.get(a)>list.get(b))
						{
							Integer temp = list.get(a);
							list.set(a, list.get(b));
							list.set(b,  temp);
						}
					}
				}
				end = System.currentTimeMillis();
				totalTime += (end-start);
			}
			System.out.println(numElements + ", " +(totalTime/10));
		}
	}
}