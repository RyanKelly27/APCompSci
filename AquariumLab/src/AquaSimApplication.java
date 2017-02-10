/*
 *  Aquarium Lab Series
 *
 *  Class: AquaSimApplication
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
 *      The AquaSimApplication class contains the main function that will
 *      run the Aquarium Simulation.  The main function creates an aquarium
 *      and a number of fish and lets the fish move in the aquarium.
 *
 *  @author  Ryan Kelly
 *  @version 8/26/16 - Made three fish move
 *  		 8/30/16 - Randomly assigned colors to the fish,
 *  				   and made it so they don't stop at the wall.
 *  				   Prompted the user for the number of simulation steps,
 *  				   and made the fish randomly change direction.
 *  		 8/31/16 - Prompted the user to input the amount of fish to show
 *  				   and made an array to hold these fish.
 *  		 9/1/16  - I created four new methods to make the fish move up or down.
 *  		 9/6/16  - I created a move method.
 *  @see Aquarium
 *  @see AquaFish
 *  @see AquaSimGUI
 **/
public class AquaSimApplication
{
    /**
     *  This is the main function.  It controls the execution of the program.
     *  @param    String args[] is never used
     **/
    public static void main(String args[])
    {
        System.out.println("This will be an aquarium simulation.");
        System.out.println("Press the Start button to start the simulation.");

        // CONSTRUCT OBJECTS NEEDED FOR THE AQUARIUM SIMULATION.

        // Construct the aquarium.  Specify its dimensions when creating it.
        Aquarium aqua;                 // create reference to an Aquarium ...
        aqua = new Aquarium(600, 480); // ... object that has now been created
        	
        // Construct a graphical user interface (GUI) to display and control
        // the simulation.  The user interface needs to know about the
        // aquarium, so we pass aqua to the user interface constructor.
        AquaSimGUI userInterface;              // create reference to GUI ...
        userInterface = new AquaSimGUI(aqua, true, true, true);  // ... and then GUI itself

        
        // Now wait for the user to press the start button.
        userInterface.waitForStart();

        

        //Request the number of simulation steps from the user.
        int numSteps = userInterface.getNumberOfSteps();
        int numFish = userInterface.getNumberOfFish();
        AquaFish[] allFish = new AquaFish[numFish];
        // RUN THE AQUARIUM SIMULATION.

        
        /*//Create a for loop that makes the fish move based on the user's input
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
        }*/

        // WRAP UP.

        // Remind user how to quit application.
        System.out.println ("Close GUI display window to quit.");

    }//end main

}//end class
