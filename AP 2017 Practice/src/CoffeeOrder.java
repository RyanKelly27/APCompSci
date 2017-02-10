import java.util.ArrayList;

// Assume the CoffeeOrder class is defined and
// all the methods work as specified
public class CoffeeOrder
{
	// Method returns the size of the order in
	// ounces of coffee
	public double getSize(){ }

	// Method returns the price of the order
	// in dollars
	public double getPrice() { }

	// Method returns the unique integer
	// ID number of the order
	public int getID() { }

	// Method returns the destination zip
	// code for the order
	public int getZip() { }
}


// Assume the class CoffeeBusiness is defined
// and that appropriate constructors and methods
// exist. You are going to add methods to the 
// class. Complete each of the methods so that
// they work as specified.
public class CoffeeBusiness
{
	// Instance Variables
	private ArrayList<CoffeeOrder> allOrders;

	// Question 1
	//  precondition: allOrders is not empty
	// postcondition: returns and removes the 
	//    the order with the specified ID from
	//    allOrders, if there is no order with
	//    that ID return null
	public CoffeeOrder pullOrder(int ID)
	{
		for(int i=0; i<allOrders.size(); i++)
		{
			
		}
	}


	// Question 2
	//  precondition: allOrders is not empty
	// postcondition: returns an ArrayList<CoffeeOrder>
	//    containing all of the CoffeeOrders in allOrders
	//    that are to be shipped to the given zip code
	public ArrayList<CoffeeOrder> getAllOrdersTo(int zip)
	{

	}



	// Question 3
	//  precondition: allOrders is not empty
	// postcondition: Returns the average price per ounce 
	//    of all the CoffeeOrders in allOrders
	public double getAverageUnitPrice()
	{

	}
}