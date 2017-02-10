
public class RecursivePrimes {

	public static boolean isPrime(int n)
	{
		if(n<2)
			return false;
		else if(n==2)
			return true;
		else if(n%2==0)
			return false;
		for(int i=3; i*i<=n; i=i+2)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	public static void recPrimes(int num)
	{
		if(isPrime(num) == true)
		{
			System.out.print(num);
			return;
		}
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
			{
				System.out.print(i+" x ");
				recPrimes(num/i);
				break;
			}
		}
	}
	
	public static void main(String[] args)
	{
		recPrimes(36);
	}
	
}