import java.util.ArrayList;

public class EncryptAlpha 
{
	private int key;
	
	/**
	 * Constructs a EncryptAlpha object and sets
	 * it encryption key to k
	 * @param k
	 */
	public EncryptAlpha(int k)
	{
		key = k;
	}
	
	
	/**
	 * This method takes a String object and converts it into an
	 * ArrayList of integers, where each integer is the sum of 
	 * consecutive pairs of characters from str where the sum is 
	 * one character's integer number value plus 1000 times the
	 * integer value of the next character. If there are an odd
	 * number of characters a ' ' is added as the last character
	 * @param str theString to be converted
	 * @return the ArrayList of integer values
	 */
	private ArrayList<Integer> convert(String str)
	{
		ArrayList<Integer> converted = new ArrayList<Integer>();
		for(int i=0; i<str.length(); i+=2)
		{
			char t1, t2 = ' ';
			t1 = str.charAt(i);
			if(i<str.length()-1)
				t2 = str.charAt(i+1);
			int x = (int)t1 + 1000*(int)t2;
			converted.add(x);
		}
		
		return converted;
	}
	
	/**
	 * This method takes an ArrayList of integers where each integer 
	 * is the sum of consecutive pairs of characters from the original
	 * String where the sum is one character's integer number value 
	 * plus 1000 times the integer value of the next character.
	 * @param converted the ArrayList to convert back into a String
	 * @return the 'original' String
	 */
	private String deconvert(ArrayList<Integer> converted)
	{
		String str = new String();
		for(int temp : converted)
		{
			char t1, t2;
			t1 = (char)(temp%1000);
			t2 = (char)(temp/1000);
			str = str + t1 + t2;
		}
		
		return str;
	}
	
	
	/**
	 * Converts the String str into an ArrayList of integers
	 * @param str a message to be encrypted
	 * @return the converted ArrayList<Integer>
	 */
	public ArrayList<Integer> encrypt(String str)
	{
		ArrayList<Integer> converted = convert(str);
		for(int i=0; i<converted.size(); i++)
		{
			int temp = converted.get(i)*key;
			converted.set(i,temp);
		}
		return converted;
	}
	
	/**
	 * Converts the ArrayList of integers converted back into
	 * the original message from which it was created.
	 * @param converted the ArrayList to be decrypted
	 * @return the original message
	 */
	public String decrypt(ArrayList<Integer> converted)
	{
		for(int i=0; i<converted.size(); i++)
		{
			int temp = converted.get(i)/key;
			converted.set(i, temp);
		}
		return deconvert(converted);
	}
	
	public ArrayList<Integer> encryptPattern(String str)
	{
		int[] shiftBy = {3,2,8,1,7,3};
		int index = 0;
		
		ArrayList<Integer> converted = convert(str);
		for(int i=0; i<converted.size(); i++)
		{
			int temp = converted.get(i)*shiftBy[index];
			converted.set(i,temp);
			
			index+=1;
			if(index == shiftBy.length)
				index=0;
		}
		return converted;
	}
	
	public String decryptPattern(ArrayList<Integer> converted)
	{
		int[] shiftBy = {3,2,8,1,7,3};
		int index = 0;
		
		for(int i=0; i<converted.size(); i++)
		{
			int temp = converted.get(i)/shiftBy[index];
			converted.set(i, temp);
			
			index+=1;
			if(index == shiftBy.length)
				index=0;
		}
		return deconvert(converted);
	}
	
	
	public static void main(String[] args)
	{
		// Brownie points for anyone who knows why the name of
		// EncryptAlpha object is enigma.
		EncryptAlpha enigma = new EncryptAlpha(13);
		String message = "I really like robots.";
		
		// Test the private methods
		ArrayList<Integer> converted = enigma.convert(message);
		System.out.println(converted);
		String original = enigma.deconvert(converted);
		System.out.println(original);
		System.out.println();
		
		// Test the public methods
		ArrayList<Integer> encrypted = enigma.encrypt(message);
		System.out.println(encrypted);
		original = enigma.decrypt(encrypted);
		System.out.println(original);
		System.out.println();
		
		//Read in quoteA.txt
		EasyReader infile = new EasyReader("quoteA.txt");
		ArrayList<String> messageA = new ArrayList<String>();
		while(!infile.eof())
		{
			messageA.add(infile.readLine());
		}
		messageA.remove(messageA.size()-1);
		
		//Test encryptPattern Method
		ArrayList<Integer> encryptedPattern = new ArrayList();
		ArrayList<ArrayList <Integer>> wholeMessage = new ArrayList();
		for(int i=0; i<messageA.size(); i++)
		{
			encryptedPattern = enigma.encryptPattern(messageA.get(i));
			wholeMessage.add(encryptedPattern);
		}
		
		for(int i=0; i<wholeMessage.size(); i++)
		{
			System.out.println(wholeMessage.get(i));
		}
		
		//Test decryptPattern Method
		String temp = new String();
		ArrayList<String> originalMessage = new ArrayList();
		for(int i=0; i<wholeMessage.size(); i++)
		{
			temp = enigma.decryptPattern(wholeMessage.get(i));
			originalMessage.add(temp);
		}
		
		for(int i=0; i<originalMessage.size(); i++)
		{
			System.out.println(originalMessage.get(i));
		}
		
		
		
		System.out.println("\n");
		EasyWriter outFile = new EasyWriter("encryptedFile.txt");
		for(int i=0; i<wholeMessage.size(); i++)
		{
			outFile.println(wholeMessage.get(i));
		}
		outFile.close();
		
		//Read in encryptedFile.txt
		EasyReader encryptedFile = new EasyReader("encryptedFile.txt");
		ArrayList<String> encryptedString = new ArrayList();
		String StringTemp = new String();
		while(!encryptedFile.eof())
		{
			StringTemp = encryptedFile.readLine();
			encryptedString.add(StringTemp);
		}
		encryptedString.remove(encryptedString.size()-1);
		
		ArrayList<Integer> tempInt = new ArrayList();
		ArrayList<ArrayList <Integer>> encryptedIntArr = new ArrayList();
		for(int i=0; i<encryptedString.size(); i++)
		{
			StringTemp = encryptedString.get(i);
			String[] items = StringTemp.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");
			for(int a=0; a<items.length; a++)
			{
				int numTemp = Integer.parseInt(items[a]);
				tempInt.add(numTemp);
			}
			encryptedIntArr.add(tempInt);
		}
		
		ArrayList<String> decryptedMessage = new ArrayList();
		for(int i=0; i<encryptedIntArr.size(); i++)
		{
			temp = enigma.decryptPattern(encryptedIntArr.get(i));
			decryptedMessage.add(temp);
		}
		
		for(int i=0; i<decryptedMessage.size(); i++)
		{
			System.out.println(decryptedMessage.get(i));
		}
		
	}
}