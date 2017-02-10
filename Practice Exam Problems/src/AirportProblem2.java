import java.util.ArrayList;

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
	// Postcondition: returns the flight with the shortest
	//				  elapsed flight time
	public Flight getShortestFlight()
	{
		Flight tempShortest = new Flight();
		tempShortest = allFlights.get(0);
		for(int i=1; i<allFlights.size(); i++)
		{
			if(tempShortest.getDistance() > allFlights.get(i).getDistance())
			{
				tempShortest = allFlights.get(i);
			}
		}
		
		return tempShortest;
	}
	
	// Problem 2
	// Precondition: 
	// Postcondition: returns an ArrayList of all the Flights
	//				  in allFlights to the given destination
	//				  that have an elapsed time shorter than
	//				  'shorterThan'
	public ArrayList<Flight> getAllFlightsToShorterThan(String code, double shorterThan)
	{
		Flight tempFlight = new Flight();
		ArrayList<Flight> matchingFlights = new ArrayList<Flight>();
		for(int i=0; i<allFlights.size(); i++)
		{
			tempFlight = allFlights.get(i);
			if(tempFlight.getArrivalPoint() == code && tempFlight.getTime() < shorterThan)
			{
				matchingFlights.add(tempFlight);
			}
		}
		
		/*for(Flight temp: allFlights)
		 * {
		 * 	if(temp.getArrivalPoint().equals(code) && temp.getTime() < shorterThan)
		 * 	{
		 * 		matches.add(temp);
		 * 	}
		 * }
		 * return matches;
		 */
		
		return matchingFlights;
	}
	
	// Problem 3
	// Precondition: 
	// Postcondition: return the shortest (in elapsed time)
	// 				  flight to the given airport destination code
	public Flight getShortestFlightTo(String code)
	{
		Flight tempFlight = new Flight();
		tempFlight = allFlights.get(0);
		for(int i=1; i<allFlights.size(); i++)
		{
			if(tempFlight.getArrivalPoint() != code || tempFlight.getTime() > allFlights.get(i).getTime())
			{
				tempFlight = allFlights.get(i);
			}
		}
		
		return tempFlight;
	}
	
}