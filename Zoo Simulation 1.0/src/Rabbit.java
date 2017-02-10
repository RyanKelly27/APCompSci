/********************************************************************

 Class:  Rabbit  (extends Prey which extends Animal)
Author:  Ryan Kelly
  Date:  October 25, 2016

Models the behavior of Rabbits in the simulation

Date			Modification
10-25-2016	Main coding on this class started
10-31-2016  Tried to create a birth rate that
			would create a stable population and 
			found out that with a high birth rate,
			the rabbits would out number the predators,
			and a low birth rate would cause the rabbits to die out. 

*********************************************************************/

import java.awt.*;
import java.util.*;


public class Rabbit extends Animal implements Prey
{
	
	private double visualRange = 30.0;
	private static Random generator = new Random();
	private int gender;
	private int birthRate;
	private int birth;
	
	/**
	*	Constructor creates a Rabbit with Position 0,0.  Animal
	*	has no cage in which to live.
	*/
	public Rabbit()
	{
		super();
		gender = generator.nextInt(2);
	}
	
	/**
	*	Constructor creates a Rabbit in a random empty spot in
	*	the given cage.
	*	@param cage  the cage in which Rabbit will be created.
	*/
	public Rabbit(Cage cage)
	{
		super(cage, Color.green);
		gender = generator.nextInt(2);
	}
	
	/**
	*	Constructor creates a Rabbit in a random empty spot in
	*	the given cage with the specified Color.
	*	@param cage  the cage in which Rabbit will be created.
	*	@param color  the color of the Rabbit
	*/
	public Rabbit(Cage cage, Color color)
	{
		super(cage, color);
		gender = generator.nextInt(2);
	}
	
	/**
	*	Constructor creates a Rabbit in the given Position
	*	the given cage with the specified Color.
	*	@param cage  the cage in which Rabbit will be created.
	*	@param color  the color of the Rabbit
	*	@param pos	the position of the Rabbit
	*/
	public Rabbit(Cage cage, Color color, Position pos)
	{
		super(cage, color, pos);
		gender = generator.nextInt(2);
	}
	
	/**
	*	Method sets the Rabbit's visual range to the given value.
	*	@param range  sets the Rabbit's visual range to 'range'
	*/
	public void setVisualRange(double range)
	{
		visualRange = range;
	}
	
	/**
	*	Returns String form of Animal, which is its position
	*	and its type.
	*	@return String form of Animal
	*/
	public String toString()
	{
		return (myPos.toString() + " is a  Rabbit.  ");
	}
	
	/**
	*	Method overwrites the Act method in Animal.  
	*/
	public void act()
	{
		super.act();
		
		if(gender == 0)
		{
			birthRate = generator.nextInt(40);
			if(birthRate == 0)
			{
				int numChildren = generator.nextInt(4);
				Position[] possible = myCage.emptyNeighbors(myPos);
				
				int i = 0;
				while(i<possible.length && i<numChildren)
				{
					Rabbit baby = new Rabbit(myCage, Color.orange, possible[i]);
					myCage.addAnimal(baby);
					i++;
				}
			}
		}
	}
	
	/**
	*	Method returns true if obj is a type that can eat 
	*	this Animal, returns false otherwise
	*	@param	obj	object to be evaluated
	*	@return true if obj can eat this Animal, false otherwise
	*/
	public boolean canItEatMe(Animal obj)
	{
		if(obj instanceof Predator)
			return true;
		return false;
	}
			
		
	/**
	*	Method returns the String form of the Animal's
	*	species, in this case "Rabbit"
	*	@return	the String "Rabbit"
	*/
	public String getSpecies()
	{
		return "Rabbit";
	}
	
}