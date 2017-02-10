
public class MultChoice {
	
	public static int Mystery(int num)
	{
		if(num<2)
			return 1;
		else
			return num * Mystery(num-1);
	}

	
	public static void main(String[] args)
	{
		//Question 3
		int x3 = 5;
		if(0 < x3)
			System.out.println(x3);
		
		
		//Question 5
		int x = 13;
		int y = 2;
		//int z = 1.0 * x/y;
		//System.out.println(z);
		
		//Question 6
		System.out.println(3/2);
		
		//Question 7
		int x7 = 0;
		for(int i=0; i<6; i++)
		{
			x = x * i;
		}
		System.out.println(x);
		
		//Question 10
		for(int i=0; i<20; i++)
		{
			System.out.println("Hello");
		}
		
		//Question 14
		int index = 0, count = 0;
		for(index=0; index<20; index++)
		{
			count+=index;
		}
		System.out.println(count);
		
		//Question 16
		System.out.println(Mystery(5));
		
		
		
		//c d d a b 
		//d a d b d
		//e a e a d
		
		/*b c d a e
		 *a d d d c
		 *c e d b c
		 */
	}
}
