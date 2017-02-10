/**
This class is intended to model a point in the two
dimensional Cartesian plane. Each point is defined
by two coordinates, (x, y). 
*/

public class Point
{
	// Instance Variables
	private double xCoord;
	private double yCoord;
	
	
	// Constructor
	
	/**
	 * Constructs the Point (x, y)
	 * @param x the x coordinate
	 * @param y the y coordinate
	 */
	public Point(double x, double y)
	{
		xCoord = x;
		yCoord = y;
	}
	
	
	// Methods
	
	/**
	 *	Returns the x coordinate of the point.
	 * 	@return x coordinate
	 */
	public double getX()
	{
		return xCoord;
	}
	
	
	/**
	 *	Returns the y coordinate of the point.
	 * 	@return y coordinate
	 */
	public double getY()
	{
		return yCoord;
	}
	
	
	/**
	 *	Sets the coordinates of the Point to the 
	 *  given coordinates x, y
	 * 	@param x the new x coordinate
	 *  @param y the new y coordinate
	 */
	public void setCoordinates(double x, double y)
	{
		xCoord = x;
		yCoord = y;
	}
	
	
	/**
	 * Returns a String representation of the Point in the
	 * form (x, y)   EX: (3.4, 5.0)
	 * Bonus: If a coordinate has an integer value (ex: 5.0) 
	 * then it shows up as an int, so that the (3.4, 5.0)
	 * would be (3.4, 5) - this is an optional addition
	 * @return the String representation of the point
	 */
	 public String toString()
	 {
		 String temp = "(" + xCoord + ", " + yCoord + ")";
		 return temp;
	 }
	 
	 
	 /**
	  * Returns the distance between this Point and the Point
	  * other. Use the distance formula in three dimensions.
	  * EX: (this.getX()-other.getX())
	  * @param the other Point
	  * @return distance between this Point and other
	  */
	 public double distanceTo(Point other)
	 {
		 double tempX = this.getX() - other.getX();
		 double tempY = this.getY() - other.getY();
		 tempX = tempX * tempX;
		 tempY = tempY * tempY;
		 double distance = Math.sqrt(tempX + tempY);
		 
		 return distance;
		 
	 }
	 
	 
	 /**
	  * Returns the slope of the line between this Point
	  * and the Point other.
	  * @param the other Point
	  * @return slope of line from this Point to other
	  */
	  public double getSlope(Point other)
	  {
		  double slope = (this.getY() - other.getY()) / (this.getX() - other.getX());
		  return slope;
	  }
	  
	  public static void main(String[] args)
	  {
		  Point a = new Point (5.0, 4.0);
		  Point b = new Point (3.0, 2.0);
		  
		  System.out.println(a.getX());
		  //Should output 5.0
		  
		  System.out.println(a.getY());
		  //Should output 4.0
		  
		  a.setCoordinates(4.0, 3.0);
		  //Should change point a's coordinates to (4.0, 3.0)
		  
		  System.out.println(a.toString());
		  //Should output (4.0, 3.0)
		  
		  System.out.println(a.distanceTo(b));
		  //Should output 1.4142135623730951
		  
		  System.out.println(a.getSlope(b));
		  //Should output 1.0
	  }

}