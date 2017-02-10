public class RecursiveAnagram {
	
	public static void anagram(String prefix, String word)
	{
		if(word.length() <= 1)
		{
			System.out.println(prefix + word);
		}
		else
		{
			for(int i=0; i<word.length(); i++)
			{
				String curChar = word.substring(i, i+1);
				String beforeCurChar = word.substring(0, i);
				String afterCurChar = word.substring(i+1);
				anagram(prefix + curChar, beforeCurChar + afterCurChar);
						
			}
		}
	}
	
	public static void main(String[] args)
	{
		anagram("", "dragon");
	}
}
