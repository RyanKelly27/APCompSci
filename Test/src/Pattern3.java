import java.util.ArrayList;


public class Pattern3 {

	public static int removeTheSpecificNumber(ArrayList<Integer> list, int number)
	{
		for(int i=0; i<list.size(); i++)
		{
			if(list.get(i) == number)
				return list.remove(i);
		}
		return;
	}
	
	
	public static void main(String[] args)
	{
		ArrayList<Integer> data = new ArrayList<Integer>();
		
		for(int i=0; i<50; i++)
		{
			data.add((int)(Math.random()*100+1));
		}
		
		System.out.println(removeTheSpecificNumber(data, 25));
		System.out.println(data.size());
		
	}
	
}
