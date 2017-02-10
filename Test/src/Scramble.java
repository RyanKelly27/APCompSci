import java.util.Random;


public class Scramble {

	private static Random generator = new Random();
	
	public static String scramble(String phrase)
	{   
		char[] characters = new char[phrase.length()];
		String encryption = phrase;
		
		//Makes sure that the new string is not the same as the old
		while(phrase.compareTo(encryption) == 0)
		{
			phrase.getChars(0, phrase.length(), characters, 0);
			
			//Code to scramble letters.
			char temp;
			for(int i=0; i<phrase.length(); i++)
			{
				int b = generator.nextInt(characters.length);
				int c = generator.nextInt(characters.length);
				temp = characters[b];
				characters[b] = characters[c];
				characters[c] = temp;
			}
			encryption = "";
			for(int i=0; i<characters.length; i++)
			{
				encryption = encryption + characters[i];
			}
		}
		
		return encryption;
	}
	
	public static void main(String[] args)
	{
		String b = "this string will be encrypted";
		for(int i=0; i<10; i++)
		{
			System.out.println(scramble(b));
		}
	}
}




