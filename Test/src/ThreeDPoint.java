/**
This class is intended to model a point in the two
dimensional Cartesian plane. Each point is defined
by two coordinates, (x, y). 
*/

public class ThreeDPoint
{
	// Instance Variables
	private double xCoord;
	private double yCoord;
	private double zCoord;
	
	// Constructor
	
	/**
	 * Constructs the Point (x, y)
	 * @param x the x coordinate
	 * @param y the y coordinate
	 * @param z the z coordinate
	 */
	public ThreeDPoint(double x, double y, double z)
	{
		xCoord = x;
		yCoord = y;
		zCoord = z;
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
	 *	Returns the x coordinate of the point.
	 * 	@return x coordinate
	 */
	public double getZ()
	{
		return zCoord;
	}
	
	
	/**
	 *	Sets the coordinates of the Point to the 
	 *  given coordinates x, y
	 * 	@param x the new x coordinate
	 *  @param y the new y coordinate
	 */
	public void setCoordinates(double x, double y, double z)
	{
		xCoord = x;
		yCoord = y;
		zCoord = z;
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
		 String temp = "(" + xCoord + ", " + yCoord + ", " + zCoord + ")";
		 return temp;
	 }
	 
	 
	 /**
	  * Returns the distance between this Point and the Point
	  * other. Use the distance formula in three dimensions.
	  * EX: (this.getX()-other.getX())
	  * @param the other Point
	  * @return distance between this Point and other
	  */
	 public double distanceTo(ThreeDPoint other)
	 {
		 double tempX = this.getX() - other.getX();
		 double tempY = this.getY() - other.getY();
		 double tempZ = this.getZ() - other.getZ();
		 tempX = tempX * tempX;
		 tempY = tempY * tempY;
		 tempZ = tempZ * tempZ;
		 double distance = Math.sqrt(tempX + tempY + tempZ);
		 
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
		  ThreeDPoint a = new ThreeDPoint (5.0, 4.0, 3.0);
		  ThreeDPoint b = new ThreeDPoint (3.0, 2.0, 1.0);
		  
		  System.out.println(a.getX());
		  //Should output 5.0
		  
		  System.out.println(a.getY());
		  //Should output 4.0
		  
		  System.out.println(a.getZ());
		  //Should output 3.0
		  
		  a.setCoordinates(4.0, 3.0, 2.0);
		  //Should change point a's coordinates to (4.0, 3.0, 2.0)
		  
		  System.out.println(a.toString());
		  //Should output (4.0, 3.0, 2.0)
		  
		  System.out.println(a.distanceTo(b));
		  //Should output 1.7320508075688772
		  
		  //System.out.println(a.getSlope(b));
		  //Should output 1.0
	  }

}