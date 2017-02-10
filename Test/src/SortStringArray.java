public class SortStringArray 
{
	public static void main(String[] args)
	{
		String[] str = new String[10];
		
		for(int i=0; i<str.length; i++)
		{
			char ch1 = (char)(Math.random()*25+65);
			char ch2 = (char)(Math.random()*25+65);
			String temp = ""+ch1+ch2;
			str[i]=temp;
		}
		
		System.out.print("Unsorted: ");
		for(int i=0; i<str.length; i++)
		{
			System.out.print(str[i]+"\t");
		}
		System.out.println();
		
		/*
		 * Put code here to sort the array str into alphabetical
		 * order.Note that you will need to look up the String class
		 * because you can't use < or > for the comparison. There
		 * is a method that will work to compare the order of
		 * two Strings.
		 */
		
		for(int i=0; i<str.length-1; i++)
		{
			for(int a=i+1; a<str.length; a++)
			{
				if(str[i].compareTo(str[a]) > 0)
				{
					String temp = str[a];
					str[a] = str[i];
					str[i] = temp;
				}
			}
		}
		
		System.out.print("  Sorted: ");
		for(int i=0; i<str.length; i++)
		{
			System.out.print(str[i]+"\t");
		}
		System.out.println();
		
	}

}