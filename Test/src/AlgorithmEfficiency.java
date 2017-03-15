import java.util.ArrayList;
import java.util.LinkedList;


public class AlgorithmEfficiency {

	public static void main(String[] args)
	{
		int numElements = 10000000;
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		
		// Put random values from 1-100 in the array
		for(int i=0; i<numElements; i++)
		{
			int num = (int)(Math.random()*100+1);
			list1.add(num);
			list2.add(num);
		}
		
		int trials = 10;
		long startTime;
		long endTime;
		long arrayTotalTime;
		long linkedTotalTime;
		
		//Insert element at 0
		for(int i=0; i<trials; i++)
		{
			startTime = System.currentTimeMillis();
			list1.add(0, 5);
			endTime = System.currentTimeMillis();
			arrayTotalTime = endTime - startTime;
			
			startTime = System.currentTimeMillis();
			list2.add(0, 5);
			endTime = System.currentTimeMillis();
			linkedTotalTime = endTime - startTime;
			
			System.out.println("Trial "+ (i+1) +" -");
			System.out.println("ArrayList time: "+arrayTotalTime);
			System.out.println("LinkedList time: "+linkedTotalTime);
		}
		System.out.println("\n");
		
		//Adding element at the end
		for(int i=0; i<trials; i++)
		{
			startTime = System.currentTimeMillis();
			list1.add(5);
			endTime = System.currentTimeMillis();
			arrayTotalTime = endTime - startTime;
			
			startTime = System.currentTimeMillis();
			list2.add(5);
			endTime = System.currentTimeMillis();
			linkedTotalTime = endTime - startTime;
			
			System.out.println("Trial "+ (i+1) +" -");
			System.out.println("ArrayList time: "+arrayTotalTime);
			System.out.println("LinkedList time: "+linkedTotalTime);
		}
		System.out.println("\n");
		
		//Inserting an element in the middle
		for(int i=0; i<trials; i++)
		{
			startTime = System.currentTimeMillis();
			list1.add(numElements/2, 5);
			endTime = System.currentTimeMillis();
			arrayTotalTime = endTime - startTime;
			
			startTime = System.currentTimeMillis();
			list2.add(numElements/2, 5);
			endTime = System.currentTimeMillis();
			linkedTotalTime = endTime - startTime;
			
			System.out.println("Trial "+ (i+1) +" -");
			System.out.println("ArrayList time: "+arrayTotalTime);
			System.out.println("LinkedList time: "+linkedTotalTime);
		}
		System.out.println("\n");
	}
}
