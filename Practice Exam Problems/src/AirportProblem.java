public class Flight
{
	// Assume these methods work as specified
	
	// Precondition: 
	// Postcondition: returns the flight code for this Flight
	public String flightCode() { }
	
	// Precondition: 
	// Postcondition: returns the total distance in miles 
	//				  for the Flight
	public double getDistance()  { }
	
	// Precondition: 
	// Postcondition: returns the total elapsed time for Flight
	public double getTime()  { }
	
	// Precondition: 
	// Postcondition: returns the (unique) three letter code
	//				  for the departure airport
	public String getDeparturePoint()  { }
	
	// Precondition: 
	// Postcondition: returns the (unique) three letter code
	//				  for the destination airport
	public String getArrivalPoint()  { }
}


// Complete the methods 
public class Airport
{
	private ArrayList<Flight> allFlights;
	
	
	// Problem 1
	// Precondition: 
	// Postcondition: returns the flight with the longest
	//				  elapsed flight time
	public Flight getLongestFlight()
	{
	
	}
	
	// Problem 2
	// Precondition: 
	// Postcondition: returns an ArrayList of all the Flights
	//				  in allFlights to the given destination
	public ArrayList<Flight> getAllFlightsTo(String code)
	{
	
	}
	
	// Problem 3
	// Precondition: 
	// Postcondition: return the shortest (in elapsed time)
	// 				  flight to the given airport destination code
	public Flight getShortestFlightTo(String code)
	{
	
	}
	
}