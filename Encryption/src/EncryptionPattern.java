import java.util.ArrayList;


public class EncryptionPattern {

	
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
			if(num>57)
				num = num - 10;
		}
		ch = (char)num;
		return ch;
	}
	
	public static String encrypt(String str)
	{
		String temp = new String();
		int[] shifts = {1,4,1,5,9};
		int index = 0;
		 
		for(int i=0; i<str.length(); i++)
		{
			temp = temp + characterShift(str.charAt(i), shifts[index]);
			
			index+=1;
			if(index == shifts.length)
				index=0;
		}
		
		str = temp;
		return str;
	}
	
	public static void main(String[] args)
	{
		EasyReader infile = new EasyReader("quoteA.txt");
		ArrayList<String> message = new ArrayList<String>();
		
		while(!infile.eof())
		{
			message.add(infile.readLine());
		}
		message.remove(message.size()-1);
		
		for(int i=0; i<message.size(); i++)
		{
			message.set(i, encrypt(message.get(i)));
		}
		
		for(int i=0; i<message.size(); i++)
		{
			System.out.println(message.get(i));
		}
	}
}
