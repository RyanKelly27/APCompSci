/*
 *  Aquarium Lab Series
 *
 *  Class: Simulation
 *
 *  Author: Your Name Here,
 *      based on a template provided by my instructor
 *
 *  Created: 
 *
 *  Modified:
 *      Your Name      Date    Reason
 *
 *  License:
 *      This program is free software; you can redistribute it
 *      and/or modify it under the terms of the GNU General Public
 *      License as published by the Free Software Foundation.
 *
 *      This program is distributed in the hope that it will be useful,
 *      but WITHOUT ANY WARRANTY; without even the implied warranty of
 *      MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *      GNU General Public License for more details.
 */

import java.awt.Color;
import java.util.Random;

/** Aquarium Lab Series:     
 *  A Simulation object controls a simulation of fish movement in
 *  an aquarium in the Aquarium Lab Series.
 *
 *  @author  Your name here
 *  @version 10 July 2002
 *  @see Aquarium
 *  @see AquaFish
 *  @see AquaSimGUI
 **/
public class Simulation
{
    // Encapsulated data: aquarium in which fish swim, list of fish,
    // and user interface that can display the results.
    private Aquarium aqua;
    private AquaFish[] allFish;
    private AquaSimGUI userInterface;

    /** Construct a Simulation object for a particular environment.
     *  @param aquarium    the aquarium in which fish will swim
     *  @param numFish     the number of fish to put in the aquarium
     *  @param gui         graphical interface that displays the aquarium
     **/
    public Simulation(Aquarium aquarium, int numFish, AquaSimGUI gui)
    {
        // Initialize the instance variables.

        // Construct the fish.
    	
    	//Construct the random number generator
        Random randNumGen = RandNumGenerator.getInstance();
        
    	//Create a variable reference to an object of the color class
        Color fishColor;
        
    	 //Created an array to hold the fish
        for(int i=0; i<numFish; i++)
        {
        	//Randomly generate a value between 0 and 5.
            int randomNum = randNumGen.nextInt(6);
        	
            //Set the color of the color variable
            //Based on the random number generated
            if(randomNum == 0)
            {
            	fishColor = Color.red;
            }
            else if(randomNum == 1)
            {
            	fishColor = Color.orange;
            }
            else if(randomNum == 2)
            {
            	fishColor = Color.yellow;
            }
            else if(randomNum == 3)
            {
            	fishColor = Color.green;
            }
            else if(randomNum == 4)
            {
            	fishColor = Color.blue;
            }
            else
            {
            	fishColor = Color.magenta;
            }
        	
            //Create the fish
        	allFish[i] = new AquaFish(aqua, fishColor);
        }
        // View the initial configuration.
        // Draw the aquarium and fish, redisplay the user interface in the
        // window so that users can see what was drawn.
        userInterface.showAquarium();
        userInterface.show(allFish);
        userInterface.repaint();
        userInterface.pauseToView();
    }

    /** Run the Aquarium Simulation.
     *  @param numSteps    the number of simulation steps to run
     **/
    public void run(int numSteps, int numFish)
    {
    	//Create a for loop that makes the fish move based on the user's input
        for (int i = 0; i < numSteps; i++)
        {
        	//Created a loop that makes each fish from the array move
        	for (int a = 0; a < numFish; a++)
        	{
        		allFish[a].move();
        	}
        	
        	//Remove the previous fish, and redraw them in their new positions.
        	userInterface.showAquarium();
        	userInterface.show(allFish);
        	userInterface.repaint();
        	userInterface.pauseToView();
        }
    }

    /** Run through a single step of the simulation. **/
    public void step()
    {
    	int numFish = userInterface.getNumberOfFish();
    	 //Create a for loop that makes the fish move based on the user's input
        for (int i = 0; i < 1; i++)
        {
        	//Created a loop that makes each fish from the array move
        	for (int a = 0; a < numFish; a++)
        	{
        		allFish[a].move();
        	}
        	
        	//Remove the previous fish, and redraw them in their new positions.
        	userInterface.showAquarium();
        	userInterface.show(allFish);
        	userInterface.repaint();
        	userInterface.pauseToView();
        }
    }

    /** Get all the fish in the aquarium. **/
    public AquaFish[] getAllFish()
    {
		return allFish;
    }

}
