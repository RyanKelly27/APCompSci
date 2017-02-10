/**
 * Fraction class - This class is intended to model fractions
 * in order to do basic arithmetic computations.
 * @author Greg King
 * @version 1.1  September 8, 2016
 * 
 */

public class Fraction 
{
	// instance variables
	private int numerator;
	private int denominator;
	
	/**
	 * Constructs a new Fraction with numerator n and denominator d.
	 * @param n numerator
	 * @param d denominator
	 */
	public Fraction(int n, int d)
	{
		numerator = n;
		denominator = d;
	}
	
	
	
	/**
	 * Constructs a new Fraction with numerator 0 and denominator 1
	 */
	public Fraction()
	{
		numerator = 0;
		denominator = 1;
	}
	
	// accessor methods: these return the value of the private
	// instance variables numerator and denominator
	public int getNumerator()
	{
		return numerator;
	}
	
	public int getDenominator()
	{
		return denominator;
	}
	
	
	// methods
	/**
	 * Simplifies the Fraction. After a call x.simplify() the
	 * Fraction x will be in simplest form
	 */
	public void simplify()
	{
		int common = gcf(numerator, denominator);
		numerator = numerator/common;
		denominator = denominator/common;
		
	}
	
	/**
	 * Returns the greatest common factor of a and b.
	 * @param a  first number
	 * @param b  second number
	 * @return	 greatest common factor of a and b
	 */
	public static int gcf(int a, int b)
	{
		if(a<b)
		{
			int temp = a;
			a = b;
			b = temp;
		}
		int check = b;
		while (a%check != 0 || b%check != 0)
		{
			check -= 1;
		}
		return check;
	}

	/**
	 * Adds Fraction f to this fraction and returns
	 * the result as a Fraction
	 * @param f  Fraction to add to this Fraction
	 * @return   sum of this Fraction and f
	 * 
	 * 
	 */
	public Fraction add(Fraction b)
	{
		int den = this.getDenominator() * b.getDenominator();
		int num = this.getNumerator() * b.getDenominator()
				+ b.getNumerator() * this.getDenominator();
		
		return(new Fraction(num, den));
	}
	
	/**
	 * Subtracts Fraction f from this fraction and returns
	 * the result as a Fraction
	 * @param f  Fraction to subtract from this Fraction
	 * @return   difference of this Fraction and f
	 */
	public Fraction subtract(Fraction b)
	{
		int den = this.getDenominator() * b.getDenominator();
		int num = this.getNumerator() * b.getDenominator()
				- b.getNumerator() * this.getDenominator();
		
		return(new Fraction(num, den));
	}
	
	/**
	 * Multiply Fraction f by this fraction and returns
	 * the result as a Fraction
	 * @param f  Fraction to multiply with this Fraction
	 * @return   product of this Fraction and f
	 */
	public Fraction multiply(Fraction b)
	{
		int num = this.getNumerator() * b.getNumerator();
		int den = this.getDenominator() * b.getDenominator();
		
		return(new Fraction(num, den));
	}
	
	/**
	 * Divides this Fraction by  Fraction f and returns
	 * the result as a Fraction
	 * @param f  Fraction to divide this Fraction by
	 * @return   quotient of this Fraction and f
	 */
	public Fraction divide(Fraction b)
	{
		int num = this.getNumerator() * b.getDenominator();
		int den = this.getDenominator() * b.getNumerator();
		
		return(new Fraction(num, den));
	}
	
	/**
	 * Returns String form of the Fraction in a/b form.
	 */
	public String toString()
	{	
		return (numerator +"/"+ denominator);
	}
	
	public double decimalValue()
	{
		return ((double)numerator / denominator);
	}
	
	/**
	*	Method designed to test the Fraction class by testing
	*	all of its methods.
	*/
	public static void main(String[] args)
	{
		Fraction a = new Fraction(2, 3);
		Fraction b = new Fraction(4, 5);
		System.out.println(a.toString());
		Fraction test;
		// should output "2/3"
		
		test = a.add(b);
		System.out.println(test.toString());
		// should output "22/15"
		
		test = a.subtract(b);
		System.out.println(test.toString());
		// should output "-2/15"
		
		test = a.multiply(b);
		System.out.println(test.toString());
		// should output "8/15"
		
		test = a.divide(b);
		System.out.println(test.toString());
		// should output "10/12"
		
		test.simplify();
		System.out.println(test.toString());
		// should output "5/6"
		
		System.out.println(test.decimalValue());
		// should output ".833333"
	}
}