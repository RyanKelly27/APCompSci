import java.util.ArrayList;


public class MyEncrypter
{
	private int key;
	
	public MyEncrypter(int k)
	{
		key = k;
	}
	
	// Returns the String encrypted
	public String encrypt(String plain)
	{
		ArrayList<Character> characters = new ArrayList<Character>();
		for(int i=0; i<plain.length(); i++)
		{
			char t1 = plain.charAt(i);
			int num = (int)t1;
			System.out.println("Char num: "+num);
			num = (num * key) + num;
			System.out.println(num);
			
			t1 = (char)num;
			characters.add(t1);
		}
		StringBuilder result = new StringBuilder(characters.size());
		for (Character c : characters) {
		  result.append(c);
		}
		String converted = result.toString();
		
		return converted;
	}

	// Returns the encrypted String decrypted
	public String decrypt(String encrypted)
	{
		
	}

	// Reads in an unencrypted file with the 
	// given filename and writes back out an
	// encrypted file 
	public void encryptFile(String filename)
	{
		
	}

	// Reads in an encrypted file with the 
	// given filename and writes back out an
	// unencrypted file 
	public void decryptFile(String filename)
	{
		
	}

	public static void main(String[] args)
	{
		MyEncrypter encrypter = new MyEncrypter(6);
		String test = "Hello world";
		
		System.out.print(encrypter.encrypt(test));
	}
	
}