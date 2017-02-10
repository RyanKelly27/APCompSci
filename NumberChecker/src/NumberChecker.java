import java.awt.*;
import BreezyGUI.*;

public class NumberChecker extends GBFrame 
{
	// Instance Variables (the window components)
	private Label inputFieldLabel;
	private IntegerField inputField;
	private Button isPrimeButton;
	private Button primeFactorizationButton;
	private TextArea outputArea;
	
	public NumberChecker()
	{
		inputFieldLabel = addLabel("Number to Check",1,1,1,1);
		inputField = addIntegerField(0,1,2,1,1);
		isPrimeButton = addButton("Is Prime?",2,1,1,1);
		primeFactorizationButton = addButton("Prime Factorization",2,2,1,1);
		outputArea = addTextArea("",3,1,3,3);
	}
	
	public void buttonClicked(Button buttonObj)
	{
		if(buttonObj == isPrimeButton)
		{
			int number = inputField.getNumber();
			if(isPrime(number) ==true)
			{
				outputArea.append(number + " is prime \n");
			}
			if(isPrime(number) ==false)
			{
				outputArea.append(number + " is not prime \n");
			}
			
		}
		
		if(buttonObj == primeFactorizationButton)
		{
			int number = inputField.getNumber();
			int OGnumber = inputField.getNumber();
			int n = 2;
			while(number != 1)
			{
				if(number % n ==0)
				{
					outputArea.append( n +" * ");
					number = number / n;
				}
				else
				{
					n = n + 1;
				}
			}
			outputArea.append( "1 = "+ OGnumber + "\n" );
		}
	}
	
	public boolean isPrime(int n)
	{
		if( n < 2)
		{
			return false;
		}
		
		if (n == 2)
		{
			return true;
		}
		
		if( n%2 == 0)
		{
			return false;
		}
		
		
		
		for(int i=3; i <= Math.sqrt(n); i+=2)
		{
			if( n % i == 0)
			{
				return false;
			}
		}
		// put code here to make the method work
		return true;
	}
	/* pseudo code for prime factorization of a given number
	 * 
	 * loop
	 * 
	 * check if number is divisible by AnotherNumber(starting at 2)
	 * if it is then divide it by AnotherNumber and go back to start
	 * if not divisible by AnotherNumber then increase AnotherNumber by 1 
	 * continue this until number is prime
	 */
	public static void main(String[] args)
	{
		NumberChecker frm = new NumberChecker();
		frm.setSize(350,350);
		frm.setVisible(true);
	}
}
