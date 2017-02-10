
public class FindTheFirstString 
{
	public static void main(String[] args)
	{
		String[] str = new String[10];
		
		for(int i=0; i<str.length; i++)
		{
			char ch1 = (char)(Math.random()*25+65); //65 = A, 90 = Z
			char ch2 = (char)(Math.random()*25+65);
			String temp = ""+ch1+ch2;
			//String temp = ""+ch1;
			str[i]=temp;
		}
		
		for(int i=0; i<str.length; i++)
		{
			System.out.print(str[i]+"\t");
		}
		System.out.println();
		
		/*
		 * Put code here to find which element of str comes first
		 * using alphabetic/alphanumeric order. Note that you will
		 * need to look up the String class because you can't use
		 * < or > for the comparison. There is a method that will 
		 * work to compare the order of two Strings.
		 */
		int firstIndex = 0;
		for(int i=1; i<str.length-1; i++)
		{
			if(str[i].compareTo(str[firstIndex]) < 0)
			{
				firstIndex = i;
			}
		}
		
		// Put code here to print out the String that comes first 
		// in alphabetical order.
		System.out.println(str[firstIndex]);
	}
}