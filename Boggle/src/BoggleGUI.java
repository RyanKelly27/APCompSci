import java.awt.Button;
import java.util.ArrayList;

import BreezyGUI.GBFrame;

public class BoggleGUI extends GBFrame
{
	public static ArrayList<Character> list = new ArrayList<Character>();
	public static String wordCreated = "";
	public static ArrayList<Button> used = new ArrayList<Button>();
	
	public Button newGame;
	public Button resetWord;
	public Button submitWord;
	public static Button letter0;
	public static Button letter1;
	public static Button letter2;
	public static Button letter3;
	public static Button letter4;
	public static Button letter5;
	public static Button letter6;
	public static Button letter7;
	public static Button letter8;
	public static Button letter9;
	public static Button letter10;
	public static Button letter11;
	public static Button letter12;
	public static Button letter13;
	public static Button letter14;
	public static Button letter15;
	
	public BoggleGUI()
	{
		newGame = addButton("New Game",5,1,1,1);
		resetWord = addButton("Reset Word",5,2,1,1);
		submitWord = addButton("Submit",5,3,1,1);
		/*letter0 = addButton("     "  + pickLetter() + "     ",1,1,1,1);
		letter1 = addButton("     "  + pickLetter() + "     ",1,2,1,1);
		letter2 = addButton("     "  + pickLetter() + "     ",1,3,1,1);
		letter3 = addButton("     "  + pickLetter() + "     ",1,4,1,1);
		letter4 = addButton("     "  + pickLetter() + "     ",2,1,1,1);
		letter5 = addButton("     "  + pickLetter() + "     ",2,2,1,1);
		letter6 = addButton("     "  + pickLetter() + "     ",2,3,1,1);
		letter7 = addButton("     "  + pickLetter() + "     ",2,4,1,1);
		letter8 = addButton("     "  + pickLetter() + "     ",3,1,1,1);
		letter9 = addButton("     "  + pickLetter() + "     ",3,2,1,1);
		letter10 = addButton("     "  + pickLetter() + "     ",3,3,1,1);
		letter11 = addButton("     "  + pickLetter() + "     ",3,4,1,1);
		letter12 = addButton("     "  + pickLetter() + "     ",4,1,1,1);
		letter13 = addButton("     "  + pickLetter() + "     ",4,2,1,1);
		letter14 = addButton("     "  + pickLetter() + "     ",4,3,1,1);
		letter15 = addButton("     "  + pickLetter() + "     ",4,4,1,1);*/
		
		letter0 = addButton("     "  + "0" + "     ",1,1,1,1);
		letter1 = addButton("     "  + "1" + "     ",1,2,1,1);
		letter2 = addButton("     "  + "2" + "     ",1,3,1,1);
		letter3 = addButton("     "  + "3" + "     ",1,4,1,1);
		letter4 = addButton("     "  + "4" + "     ",2,1,1,1);
		letter5 = addButton("     "  + "5" + "     ",2,2,1,1);
		letter6 = addButton("     "  + "6" + "     ",2,3,1,1);
		letter7 = addButton("     "  + "7" + "     ",2,4,1,1);
		letter8 = addButton("     "  + "8" + "     ",3,1,1,1);
		letter9 = addButton("     "  + "9" + "     ",3,2,1,1);
		letter10 = addButton("     "  + "10" + "     ",3,3,1,1);
		letter11 = addButton("     "  + "11" + "     ",3,4,1,1);
		letter12 = addButton("     "  + "12" + "     ",4,1,1,1);
		letter13 = addButton("     "  + "13" + "     ",4,2,1,1);
		letter14 = addButton("     "  + "14" + "     ",4,3,1,1);
		letter15 = addButton("     "  + "15" + "     ",4,4,1,1);
	}
	public void buttonClicked(Button buttonObj)
	{
		if(buttonObj == newGame)
		{
			dispose();
			BoggleGUI frm = new BoggleGUI();
			frm.setSize(700,700);
			frm.setVisible(true);
			wordCreated = "";
		}
		if(buttonObj == resetWord)
		{
			wordCreated = "";
		}
		if(buttonObj == submitWord)
		{
			System.out.println(wordCreated);
		}
		if(buttonObj == letter0)
		{
			wordCreated = wordCreated + letter0.getLabel().trim();
			removeInvalidChoices(0);
		}
		if(buttonObj == letter1)
		{
			wordCreated = wordCreated + letter1.getLabel().trim();
		}
		if(buttonObj == letter2)
		{
			wordCreated = wordCreated + letter2.getLabel().trim();
		}
		if(buttonObj == letter3)
		{
			wordCreated = wordCreated + letter3.getLabel().trim();
		}
		if(buttonObj == letter4)
		{
			wordCreated = wordCreated + letter4.getLabel().trim();
		}
		if(buttonObj == letter5)
		{
			wordCreated = wordCreated + letter5.getLabel().trim();
		}
		if(buttonObj == letter6)
		{
			wordCreated = wordCreated + letter6.getLabel().trim();
		}
		if(buttonObj == letter7)
		{
			wordCreated = wordCreated + letter7.getLabel().trim();
		}
		if(buttonObj == letter8)
		{
			wordCreated = wordCreated + letter8.getLabel().trim();
		}
		if(buttonObj == letter9)
		{
			wordCreated = wordCreated + letter9.getLabel().trim();
		}
		if(buttonObj == letter10)
		{
			wordCreated = wordCreated + letter10.getLabel().trim();
		}
		if(buttonObj == letter11)
		{
			wordCreated = wordCreated + letter11.getLabel().trim();
		}
		if(buttonObj == letter12)
		{
			wordCreated = wordCreated + letter12.getLabel().trim();
		}
		if(buttonObj == letter13)
		{
			wordCreated = wordCreated + letter13.getLabel().trim();
		}
		if(buttonObj == letter14)
		{
			wordCreated = wordCreated + letter14.getLabel().trim();
		}
		if(buttonObj == letter15)
		{
			wordCreated = wordCreated + letter15.getLabel().trim();
		}
		
	}
	public static String pickLetter()
	{
		return list.get((int)(Math.random()*list.size())) + "";
	}
	
	public static void removeInvalidChoices(int num)
	{
		if(num == 0)
		{
			used.get(2).disable();
			used.get(3).disable();
			used.get(6).disable();
			used.get(7).disable();
			used.get(8).disable();
			used.get(9).disable();
			used.get(10).disable();
			used.get(11).disable();
			used.get(12).disable();
			used.get(13).disable();
			used.get(14).disable();
			used.get(15).disable();
		}
	}
	
	public static void main(String[] args)
	{
		for(int i=0; i<5;i++)
		{	
			list.add('a');
			list.add('d');
			list.add('e');
			list.add('e');
			list.add('h');
			list.add('i');
			list.add('l');
			list.add('n');
			list.add('o');
			list.add('r');
			list.add('s');
			list.add('t');
			list.add('t');
		}	
		for(int i=0; i<4; i++)
		{
			list.add('a');
		}
		for(int i=0; i<3; i++)
		{
			list.add('c');
			list.add('e');
			list.add('f');
			list.add('g');
			list.add('m');
			list.add('o');
			list.add('u');
			list.add('w');
		}
		for(int i=0; i<2; i++)
		{
			list.add('b');
			list.add('h');
			list.add('i');
			list.add('n');
			list.add('p');
			list.add('s');
			list.add('y');
		}
		for(int i=0; i<1; i++)
		{
			list.add('j');
			list.add('k');
			list.add('q');
			list.add('r');
			list.add('v');
			list.add('x');
			list.add('z');
		}
		
		used.add(letter0);
		used.add(letter1);
		used.add(letter2);
		used.add(letter3);
		used.add(letter4);
		used.add(letter5);
		used.add(letter6);
		used.add(letter7);
		used.add(letter8);
		used.add(letter9);
		used.add(letter10);
		used.add(letter11);
		used.add(letter12);
		used.add(letter13);
		used.add(letter14);
		used.add(letter15);
		
		BoggleGUI frm = new BoggleGUI();
		frm.setSize(700,700);
		frm.setVisible(true);
	}
}
