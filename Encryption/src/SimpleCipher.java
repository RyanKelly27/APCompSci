import java.util.ArrayList;

public class SimpleCipher
{
	/**
	 * Takes a single letter or number character and shifts 
	 * it 'shift' positions down the alphabet (or digits),
	 * wrapping around if necessary. Does nothing with
	 * non-letter, non-number characters (they stay the same)
	 * @param ch
	 * @param shift
	 * @return the shifted character
	 */
	public static char characterShift(char ch, int shift)
	{
		shift = shift%26;
		int num = (int)ch;
		if(num >=65 && num <= 90) 
		{
			num = num + shift;
			if(num>90)
				num = num-26;
		}
		else if(num >=97 && num <= 122) 
		{
			num = num + shift;
			if(num>122)
				num = num-26;
		}
		else if(num>=48 && num<=57)
		{
			num = num + shift;
			while(num>57)
				num = num - 10;
		}
		ch = (char)num;
		return ch;
	}
	
	public static char decrypt(char ch, int shift)
	{
		shift = shift%26;
		int num = (int)ch;
		if(num >=65 && num <= 90) 
		{
			num = num - shift;
			if(num<65)
				num = num+26;
		}
		else if(num >=97 && num <= 122) 
		{
			num = num - shift;
			if(num<97)
				num = num+26;
		}
		else if(num>=48 && num<=57)
		{
			num = num - shift;
			while(num<48)
				num = num + 10;
		}
		ch = (char)num;
		return ch;
	}
	
	
	
	
	// Sample code to read a file, the file must be in the workspace
	// folder for the project
	public static void main(String[] args)
	{
		EasyReader infile = new EasyReader("quoteA.txt");
		ArrayList<String> message = new ArrayList<String>();
		
		while(!infile.eof())
		{
			message.add(infile.readLine());
		}
		message.remove(message.size()-1);  // removes end of file character
		
		String temp = "";
		for(int i=0; i<message.size(); i++)
		{
			for(int a=0; a<message.get(i).length(); a++)
			{
				temp = temp + characterShift(message.get(i).charAt(a), 20);
			}
			message.set(i, temp);
			temp = "";
		}
		
		for(int i=0; i<message.size(); i++)
		{
			System.out.println(message.get(i));
		}
		
		temp = "";
		for(int i=0; i<message.size(); i++)
		{
			for(int a=0; a<message.get(i).length(); a++)
			{
				temp = temp + decrypt(message.get(i).charAt(a), 20);
			}
			message.set(i, temp);
			temp = "";
		}
		
		for(int i=0; i<message.size(); i++)
		{
			System.out.println(message.get(i));
		}
	}
}