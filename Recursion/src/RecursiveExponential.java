
public class RecursiveExponential {

	//  precondition: 
	// postcondition: method returns base^exponent
	public static int exp(int base, int exponent)
	{
		if(exponent == 1)
			return base;
		else
		{
			return base * exp(base, exponent-1);
		}
	}

	public static void main(String[] args)
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println("2^"+i+" is: "+exp(2,i));
		}
	}
}
