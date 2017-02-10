public class Circle
{
	// Instance Variables
	private double xCoord;
	private double yCoord;
	private double radius;
	
	// Static Variables
	public static double pi = 3.1415926;
	
	// Constructor
	/**
	 * Constructs a Circle with a center (xCoor, yCoord)
	 * and radius r
	 * @param xCoor x coordinate of center
	 * @param yCoor y coordinate of center
	 * @param r radius
	 */
	public Circle(double x, double y, double r)
	{
		xCoord = x;
		yCoord = y;
		radius = r;
	}
	
	// Methods
	
	/**
	 * Returns the x coordinate of the Circle's center
	 * @return x coordinate of center
	 */
	public double xCoordinate()
	{
		return xCoord;
	}
	
	/**
	 * Returns the y coordinate of the Circle's center
	 * @return y coordinate of center
	 */
	public double yCoordinate()
	{
		return yCoord;
	}
	
	/**
	 * Returns the Circle's radius
	 * @return radius of circle
	 */
	public double getRadius()
	{
		return radius;
	}
	
	/**
	 * Returns the Circle's circumference
	 * @return circumference of Circle
	 */
	public double circumference()
	{
		double circumference = 2 * pi * radius;
		return circumference;
	}
	
	/**
	 * Returns the Circle's area
	 * @return area of Circle
	 */
	public double area()
	{
		double area = pi * (radius * radius);
		return area;
	}
	
	/**
	 * Sets the coordinates of Circle's center to x,y
	 * @param setx
	 */
	public void setCenter(double x, double y)
	{
		xCoord = x;
		yCoord = y;
	}
	
	/**
	 * Sets the radius of circle to r
	 * @param setx
	 */
	public void setRadius(double r)
	{
		radius = r;
	}
	
	/**
	 * Returns a String form of the circle with the form
	 * (x,y)  r = ##
	 * @return String form of circle
	 */
	public String toString()
	{
		String temp = "(" + xCoord + ", " + yCoord + ") r = " + radius;
		return temp;
	}
	
	public static void main(String[] args)
	{
		Circle A = new Circle(0,0, 2);
		Circle B = new Circle(3,4,4.2);
		
		System.out.println("Circle A: " + A.toString());
		System.out.println("Circle B: " + B.toString());
		
		System.out.println("Area A = " + A.area());
		System.out.println("Circumference of B = " + B.circumference());
		
		A.setCenter(-2,-2);
		A.setRadius(5);
		
		System.out.println(A.xCoordinate());
		System.out.println(A.yCoordinate());
		System.out.println(A.getRadius());
	}
}