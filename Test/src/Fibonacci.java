import java.math.BigInteger;


public class Fibonacci {

	public static BigInteger recFib(int n)
	{
		if(n<2)
			return BigInteger.valueOf(1);
		else
			return recFib(n-1).add(recFib(n-2));
	}
	
	public static void main(String[] args)
	{
		for(int i=0; i<50; i++)
		{
			System.out.println(i +":"+ recFib(i));
		}
	}
}
