import java.awt.*;

import BreezyGUI.*;

/*
 * Names: Ryan Kelly
 * Date: 10/13/16
 * Description: The user enters in a number from 1 to 100
 * 				for the computer to guess. The user tells the
 * 				computer if it is high or low, and the computer
 * 				only has 8 chances to guess the correct number.
 */

public class HiLoMode2 extends GBFrame 
{
	private int guessCount = 8;
	private int number;
	private int guess;
	private int lowerLimit = 0;
	private int higherLimit = 101;
	private int gameStarted = 0;
	
	private Button tooHigh;
	private Button tooLow;
	private Button startGame;
	private Button restart;
	private Button closeGame;
	
	private TextArea message;
	private TextArea guessesLeft;
	
	private IntegerField answer;
 	
   	public HiLoMode2( )
   	{
   		message = addTextArea("Enter a number from 1 to 100 in the field below the start game button.",1,1,5,1); 
   		guessesLeft = addTextArea("The computer has 8 guesses left",2,1,5,1);
   		
   		tooLow = addButton("Too Low",3,1,1,1);
   		startGame = addButton("Start Game",3,2,1,1);
   		tooHigh = addButton("Too High",3,3,1,1);
   		restart = addButton("Restart",5,1,1,1);
   		closeGame = addButton("Close Game",5,3,1,1);
   		
   		answer = addIntegerField(1,4,1,3,3);
   	}

   	public void buttonClicked (Button buttonObj)
   	{
   		if(buttonObj == startGame)
   		{
   			if(gameStarted == 0)
   			{
   				number = answer.getNumber();
   				if(number <= 0 || number >= 101)
   				{
   					message.setText("You need to choose a valid number.");
   				}
   				else
   				{
   					guess = 50;
   					if(guess == number)
   					{
   						message.setText("The computer guessed "+guess+" and got it correct!");
   					}
   					else
   					{
   						message.setText("The computer guessed "+guess+". Is it high or low?");
   					}
   	   			
   					guessCount = guessCount - 1;
   					guessesLeft.setText("The computer has " + guessCount + " guesses left");
   					gameStarted = 1;
   				}
   			}
   		}
   		
   		if(buttonObj == tooLow)
   		{
   			if(number <= 0 || number >= 101)
   			{
   				message.setText("You need to choose a number and press the start game button.");
   			}
   			else
   			{
   				if(guess > number)
   	   			{
   	   				message.setText("Incorrect response. The computer guessed "+guess+". Is it high or low?");
   	   			}
   	   			if(guess < number)
   	   			{
   	   				
   	   				lowerLimit = guess;
   	   				int guessTemp = (higherLimit - lowerLimit) / 2;
   	   				guess = guess + guessTemp;
   	   				guessCount = guessCount - 1;
   	   				guessesLeft.setText("The computer has " + guessCount + " guesses left");
   	   				
   	   				if(guess == number)
   	   		   		{
   	   		   			message.setText("The computer guessed "+guess+" and got it correct!");
   	   		   		}
   	   		   		else
   	   		   		{
   	   		   			message.setText("The computer guessed "+guess+". Is it high or low?");
   	   		   		}
   	   			}
   			}
   		}
   		
   		if(buttonObj == tooHigh)
   		{
   			if(number <= 0 || number >= 101)
   			{
   				message.setText("You need to choose a number and press the start game button.");
   			}
   			else
   			{
   				if(guess < number)
   	   			{
   	   				message.setText("Incorrect response. The computer guessed "+guess+". Is it high or low?");
   	   			}
   	   			if(guess > number)
   	   			{
   	   				
   	   				higherLimit = guess;
   	   				int guessTemp = (higherLimit - lowerLimit) / 2;
   	   				guess = guess - guessTemp;
   	   				guessCount = guessCount - 1;
   	   				guessesLeft.setText("The computer has " + guessCount + " guesses left");
   	   				
   	   				if(guess == number)
   	   		   		{
   	   		   			message.setText("The computer guessed "+guess+" and got it correct!");
   	   		   		}
   	   		   		else
   	   		   		{
   	   		   			message.setText("The computer guessed "+guess+". Is it high or low?");
   	   		   		}
   	   			}
   			}
   		}
   		
   		if(buttonObj == restart)
   		{
   			gameStarted = 0;
   			guessCount = 8;
   			lowerLimit = 0;
   			higherLimit = 101;
   			number = 0;
   			message.setText("Enter a number from 1 to 100 in the field below the start game button.");
   			guessesLeft.setText("The computer has 8 guesses left");
   		}
   		
   		if(buttonObj == closeGame)
   		{
   			System.exit(0);
   		}
    }
    
    public static void main (String[] args)
	{
		//Instantiate the GUI part
		Frame frm = new HiLoMode2();    
		//Set the application's window width and height in pixels
		frm.setSize (550, 400);  
		//Make the window visible to the user
		frm.setVisible (true);           
	}
      	
 }