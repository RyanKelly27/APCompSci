import java.awt.*;

import BreezyGUI.*;

/*
 * Names: Ryan Kelly
 * Date: 10/13/16
 * Description: The computer generates a random number from 1 
 * 				to 100, and the user has to guess it within 8 
 * 				guesses.
 */

public class HiLoMode1 extends GBFrame 
{
	private int number = (int)(Math.random()*100) + 1;
	private int guessCount = 8;
	private int answerGuessed = 0;
	
	private TextArea message;
	private TextArea guessesLeft;
	private IntegerField guess;
	
	private Button enterNumber;
	private Button closeGame;
	private Button restart;
	
   	public HiLoMode1( )
   	{
   		message = addTextArea("Guess a number from 1 to 100.",1,1,5,1); 
   		guessesLeft = addTextArea("You have 8 guesses left",2,1,5,1);
   		guess = addIntegerField(1,4,1,3,3);
   		
   		enterNumber = addButton("Enter number",3,2,1,1);
   		restart = addButton("Restart",5,1,1,1);
   		closeGame = addButton("Close Game",5,3,1,1);
   	}

   

   	public void buttonClicked (Button buttonObj)
   	{
   		
   		if(buttonObj == enterNumber)
   		{
   			if(answerGuessed == 0)
   			{
   				int userGuess = guess.getNumber();

   				if (userGuess != number)
   				{
   					if(userGuess < number)
   						message.setText("Too low. Guess again.");
   				
   					if(userGuess > number)
   						message.setText("Too High. Guess again.");
   				}
   				else
   				{
   					message.setText("You guessed the correct number!");
   					answerGuessed = 1;
   				}
   			
   				guessCount = guessCount - 1;
   				if(guessCount == 1)
   					guessesLeft.setText("You have " + guessCount + " guess left.");
   				if(guessCount != 1)
   					guessesLeft.setText("You have " + guessCount + " guesses left.");
   			
   				if(guessCount == 0 && userGuess != number)
   				{
   					message.setText("You have run out of guesses. The correct number was " + number + ".");
   					answerGuessed = 1;
   				}
   			}
   		}
   		
   		if(buttonObj == restart)
   		{
   			guessCount = 8;
   			answerGuessed = 0;
   			number = (int)(Math.random()*100) + 1;
   			message.setText("Guess a number from 1 to 100.");
   			guessesLeft.setText("You have 8 guesses left.");
   		}
   		
   		if(buttonObj == closeGame)
   		{
   			System.exit(0);
   		}
    }
    
    public static void main (String[] args)
	{
		//Instantiate the GUI part
		Frame frm = new HiLoMode1();    
		//Set the application's window width and height in pixels
		frm.setSize (550, 400);  
		//Make the window visible to the user
		frm.setVisible (true);           
	}
      	
 }