import java.util.ArrayList;

public class Shoe
{
	// Assume the following methods work as specified
	// precondition:
	// postcondition: returns the size of the shoe (in men's sizes)
	public double getSize() { }

	// precondition:
	// postcondition: returns the price of the shoe (in dollars)
	public double price() { }

	// precondition:
	// postcondition: returns the type of the shoe, the possible types
	//				  include street, running, athletic, and boot
	public String getType() { }




	// Example Problem 1
	// precondition: 
	// postcondition: returns the sum of the prices of
	//				  all the Shoes in the array
	public static double getTotalCost(Shoe[] shoes)
	{
		double sum = 0;
		
		for(int i=0; i<shoes.length; i++)
		{
			sum =+ shoes[i].price();
		}
		
		return sum;
	}

	//Example Problem 2
	//precondition: the array is not empty
	//postcondition: returns an ArrayList<Shoe> containing
	//     all the shoes in the array of the given type
	public static ArrayList<Shoe> getAllShoesOfType(String type, Shoe[] shoes)
	{
		ArrayList<Shoe> shoesType = new ArrayList<Shoe>();
		
		for(int i=0; i<shoes.length; i++)
		{
			if(shoes[i].getType().equals(type))
			{
				shoesType.add(shoes[i]);
			}
		}
		
		return shoesType;
	}

	//Example Problem 3
	//precondition: there is a unique cheapest Shoe in
	//the array shoes of the given type
	//postcondition: returns the cheapest Shoe object 
	//in the array shoes of the given type
	public static Shoe cheapestOfType(Shoe[] shoes, String type)
	{
		ArrayList<Shoe> matchingType = new ArrayList<Shoe>();
		for(int i=0; i<shoes.length; i++)
		{
			if(shoes[i].getType().equals(type))
			{
				matchingType.add(shoes[i]);
			}
		}
		
		
		Shoe cheapest = matchingType.get(0);
		for(int i=1; i<matchingType.size(); i++)
		{
			if(matchingType.get(i).price() < cheapest.price())
			{
				cheapest = matchingType.get(0);
			}
		}
		return cheapest;
	}
}