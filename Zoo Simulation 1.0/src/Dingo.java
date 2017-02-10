/******************************************************************************

 Class:  Dingo  (extends Predator which extends Animal)
Author:  Ryan Kelly
  Date:  October 31, 2016

Models the behavior of Dingos in the simulation

Date			Modification
10-31-2016	Main coding on this class started


*******************************************************************************/

import java.awt.*;

public class Dingo extends Animal implements Prey, Predator 
{	
	private double visualRange = 50.0;
	
	/**
	*	Constructor creates a Dingo with Position 0,0.  Animal
	*	has no cage in which to live.
	*/
	public Dingo()
	{
		super();
	}
	
	/**
	*	Constructor creates a Dingo in a random empty spot in
	*	the given cage.
	*	@param cage  the cage in which Dingo will be created.
	*/
	public Dingo(Cage cage)
	{
		super(cage, Color.orange);
	}
	
	/**
	*	Constructor creates a Dingo in a random empty spot in
	*	the given cage with the specified Color.
	*	@param cage  the cage in which Dingo will be created.
	*	@param color  the color of the Dingo
	*/
	public Dingo(Cage cage, Color color)
	{
		super(cage, color);
	}
	
	/**
	*	Constructor creates a Dingo in the given Position
	*	the given cage with the specified Color.
	*	@param cage  the cage in which Dingo will be created.
	*	@param color  the color of the Dingo
	*	@param pos	the position of the Dingo
	*/
	public Dingo(Cage cage, Color color, Position pos)
	{
		super(cage, color, pos);
	}
	
	/**
	*	Method causes the Dingo to act.  This may include 
	*	any number of behaviors (moving, eating, etc.).
	*/
	public void act()
	{
		Animal closestPredator = findClosestPredator();
		Animal closestPrey = findClosestPrey();
		
		if(myPos.distanceTo(closestPrey.getPosition()) > myPos.distanceTo(closestPredator.getPosition()))
		{
			// In this case it sees a predator and tries to run away
			if(closestPredator instanceof Predator && !(closestPredator instanceof Dingo))
			{
				int predatorX = closestPredator.getPosition().getX();
				int predatorY = closestPredator.getPosition().getY();
				int myX = myPos.getX();
				int myY = myPos.getY();
				Position newPos, oldPos = new Position(myX, myY);
			
				if(predatorX > myX && myX > 0)
					myX--;
				else if (predatorX < myX && myX < myCage.getMax_X()-1)
					myX++;
				if(predatorY > myY && myY > 0)
					myY--;
				else if(predatorY < myY && myY < myCage.getMax_Y()-1)
					myY++;
				newPos = new Position(myX, myY);
				
				// SmartGazelle could not move away, so it moves as a 
				// generic Prey, which means randomly
				if(newPos.equals(oldPos))
					super.act();
				// SmartGazelle moves to new position which is empty
				else if (myCage.isEmptyAt(newPos))
				{
					myPos = newPos;
					myCage.moveAnimal(oldPos, this);
				}
				// SmartGazelle could not move to a new location because
				// it was not empty, so it moves as a generic Prey (randomly)
				else
				{
					super.act();
				}
			}
			// SmartGazelle could not see a predator, so it acts as a generic
			// Prey would act, meaning random movement
			else
				super.act();
		}
		else if(myPos.distanceTo(closestPrey.getPosition()) < myPos.distanceTo(closestPredator.getPosition()))
		{
			int xPrey, yPrey, myX, myY;
			
			if(isSomethingICanEat(closestPrey)==true && !(closestPrey instanceof Dingo))
			{
				xPrey = closestPrey.getPosition().getX();
				yPrey = closestPrey.getPosition().getY();
				myX = myPos.getX();
				myY = myPos.getY();
				Position newPos, oldPos = new Position(myX, myY);
				
				// Compare x and y coordinates and move toward
				// the Prey (by adding or subtracting one to each)
				if(xPrey>myX)
					myX++;
				else if (xPrey<myX)
					myX--;
				if(yPrey>myY)
					myY++;
				else if (yPrey<myY)
					myY--;
				
				newPos = new Position(myX, myY);
				
				// check to see if Lion just caught Prey
				if(newPos.equals(closestPrey.getPosition()))
				{
					closestPrey.kill();
					myCage.removeAnimal(closestPrey);
					myPos = newPos;
					myCage.moveAnimal(oldPos, this);
				}
				// check to see if newPos is empty
				else if (myCage.isEmptyAt(newPos))
				{
					myPos = newPos;
					myCage.moveAnimal(oldPos, this);
				}
				// newPos was already filled, move as generic Animal
				else
					super.act();
			}
		}
	}
	
	
	
	/**
	*	Method returns the closest Prey to the Dingo provided that Prey is
	*	also within the Dingo's visual range.  If no Prey is seen it will return
	*	a generic Animal.
	*	@return	closest Prey the Dingo can see
	*/
	public Animal findClosestPrey()
	{
		
		Animal closestPrey = new Animal(myCage);
		double distanceToClosest = visualRange+.01;
		// Distance set to just longer than a Dingo can see
		
		for(int y=0; y<myCage.getMax_Y(); y++)
		{
			for(int x=0; x<myCage.getMax_X(); x++)
			{
				if(isSomethingICanEat(myCage.animalAt(x,y)) == true)
				{
					if(myPos.distanceTo(new Position(x,y)) < distanceToClosest)
					{
						closestPrey = myCage.animalAt(x,y);
						distanceToClosest = myPos.distanceTo(new Position(x,y));
					}
				}
			}
		}
		
		return closestPrey;
	}
	
	
	/**
	*	Method returns the closest Predator to the Gazelle provided that 
	*	Predator is also within the Gazelle's visual range, if no Predators
	*	are seen the method returns a generic Animal.
	*	@return	closest Predator the Gazelle can see
	*/
	public Animal findClosestPredator()
	{
		Animal closestPredator = new Animal(myCage);
		double distanceToClosest = visualRange+.01;
		// Distance set to just longer than a Gazelle can see
		
		for(int y=0; y<myCage.getMax_Y(); y++)
		{
			for(int x=0; x<myCage.getMax_X(); x++)
			{
				if(myCage.animalAt(x,y) instanceof Predator)
				{
					if(myPos.distanceTo(new Position(x,y)) < distanceToClosest)
					{
						closestPredator = myCage.animalAt(x,y);
						distanceToClosest = myPos.distanceTo(new Position(x,y));
					}
				}
			}
		}	
		return closestPredator;
	}
	
	/**
	*	Method returns true if obj is a type the animal can eat,
	*	returns false otherwise
	*	@param	obj	object to be evaluated
	*	@return true if obj can be eaten, false otherwise
	*/
	public boolean isSomethingICanEat(Animal obj)
	{
		if(obj instanceof Prey && !(obj instanceof Dingo))
		{
			return true;
		}
		return false;
	}
	
	/**
	*	Method sets the Dingos's visual range to the given value.
	*	@param range  sets the Dingo's visual range to 'range'
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
		return (myPos.toString() + " is a Dingo.  ");
	}
	
	/**
	*	Method returns the String form of the Animal's
	*	species, in this case "Dingo"
	*	@return	the String "Dingo"
	*/
	public String getSpecies()
	{
		return "Dingo";
	}

	@Override
	public boolean canItEatMe(Animal obj) {
		// TODO Auto-generated method stub
		return false;
	}

	
}