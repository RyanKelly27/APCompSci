public class Position
{
	// Instance variables
		/* Add variables to record the longitude & latitude 
		   in degrees, minutes and seconds (with direction) */
	private int degreesLa;
	private int minutesLa;
	private int secondsLa;
	private char directionLa;
	private int degreesLo;
	private int minutesLo;
	private int secondsLo;
	private char directionLo;
	private double degreesDecLa;
	private double degreesDecLo;
	
	// Constructors
	// One should take the coordinates in dd, mm, ss, direction form
	// and one should take it in decimal form
	public Position(int dLa, int mLa, int sLa, char dirLa, int dLo, int mLo, int sLo, char dirLo)
	{
		degreesLa = dLa;
		minutesLa = mLa;
		secondsLa = sLa;
		directionLa = dirLa;
		degreesLo = dLo;
		minutesLo = mLo;
		secondsLo = sLo;
		directionLo = dirLo;
	}
	
	public Position(double dLa, char dirLa, double dLo, char dirLo)
	{
		degreesDecLa = dLa;
		directionLa = dirLa;
		degreesDecLo = dLo;
		directionLo = dirLo;
	}
	
	// Methods
	
	/**
	 *	Method returns the latitude of this position with
	 *  the format: 34¡ 12' 14" North
	 *  (for "34 degrees, 12 minutes, 14 seconds North)
	 *  @return latitude as a String
	 */
	public String getLatitude()
	{
		String tempDirLa;
		if(directionLa=='N')
		 {
			 tempDirLa = "North";
		 }
		 else
		 {
			 tempDirLa = "South";
		 }
		
		String temp = degreesLa + "¼ " + minutesLa + "' " + secondsLa + "\" " + tempDirLa;
		return temp;
	}
	
	
	/**
	 *	Method returns the longitude of this position with
	 *  the format: 34¡ 12' 14" West
	 *  (for "34 degrees, 12 minutes, 14 seconds West)
	 *  @return latitude as a String
	 */
	public String getLongitude()
	{
		String tempDirLo;
		if(directionLo=='W')
		 {
			 tempDirLo = "West";
		 }
		 else
		 {
			 tempDirLo = "East";
		 }
		
		String temp = degreesLo + "¼ " + minutesLo + "' " + secondsLo + "\" " + tempDirLo;
		return temp;
	}
	
	
	/**
	 *	Method returns the latitude in degrees of this position with
	 *  the format: 15.186666666666667¼ North
	 *  (for "34 degrees, 12 minutes, 14 seconds North)
	 *  @return latitude in decimal as a String
	 */
	public String getLatitudeInDecimal()
	{
		String tempDirLa;
		if(directionLa=='N')
		 {
			 tempDirLa = "North";
		 }
		 else
		 {
			 tempDirLa = "South";
		 }
		
		degreesDecLa = degreesLa + (minutesLa / 60.0) + (secondsLa / 3600.0);
		
		String temp = degreesDecLa + "¼ " + tempDirLa;
		return temp;
	}
	
	
	/**
	 *	Method returns the longitude in degrees of this position with
	 *  the format: 21.25861111111111¼ West
	 *  (for "34 degrees, 12 minutes, 14 seconds West)
	 *  @return longitude in decimal as a String
	 */
	public String getLongitudeInDecimal()
	{
		String tempDirLo;
		if(directionLo=='W')
		 {
			 tempDirLo = "West";
		 }
		 else
		 {
			 tempDirLo = "East";
		 }
		
		degreesDecLo = degreesLo + (minutesLo / 60.0) + (secondsLo / 3600.0);
		
		String temp = degreesDecLo + "¼ " + tempDirLo;
		return temp;
	}
	
	
	/**
	 *	Method returns the degrees of latitude alone
	 *  @return degrees of latitude
	 */
	public int getDegreesLat()
	{
		return degreesLa;
	}
	
	
	/**
	 *	Method returns the degrees of latitude alone
	 *  @return degrees of longitude
	 */
	public int getDegreesLon()
	{
		return degreesLo;
	}
	
	
	/**
	 *	Method returns the minutes of latitude alone
	 *  @return minutes of latitude
	 */
	public int getMinutesLat()
	{
		return minutesLa;
	}
	
	
	/**
	 *	Method returns the minutes of latitude alone
	 *  @return minutes of longitude
	 */
	public int getMinutesLon()
	{
		return minutesLo;
	}
	
	
	/**
	 *	Method returns the seconds of latitude alone
	 *  @return seconds of latitude
	 */
	public int getSecondsLat()
	{
		return secondsLa;
	}
	
	
	/**
	 *	Method returns the seconds of latitude alone
	 *  @return seconds of longitude
	 */
	public int getSecondsLon()
	{
		return secondsLo;
	}
	
	
	/**
	 *	Method returns the direction of latitude as
	 *  a single character, N or S for north or south
	 *  @return direction of latitude N or S
	 */
	public char directionLat()
	{
		return directionLa;
	}
	
	
	/**
	 *	Method returns the direction of latitude as
	 *  a single character, E or W for east or west
	 *  @return direction of longitude E or W
	 */
	public char directionLon()
	{
		return directionLo;
	}
	
	
	/**
	 * Returns the position as a String in the form
	 * 34¡ 12' 14" North, 21¡ 08' 11" West
	 * @return the String form of the Position
	 */
	 public String toString()
	 {
		 String tempDirLa;
		 String tempDirLo;
		 if(directionLa=='N')
		 {
			 tempDirLa = "North";
		 }
		 else
		 {
			 tempDirLa = "South";
		 }
		 
		 if(directionLo=='W')
		 {
			 tempDirLo = "West";
		 }
		 else
		 {
			 tempDirLo = "East";
		 }
		 
		 String temp = degreesLa + "¼ " + minutesLa + "' " + secondsLa + "\" " + tempDirLa + ", " + degreesLo + "¼ " + minutesLo + "' " + secondsLo + "\" " + tempDirLo;
		 return temp;
	 }
	 
	 
	 public double getDistance(Position other)
	 {
		 //turn lat and long into decimal form.
		 //dlon = lon2 - lon1
		 //dlat = lat2- lat1
		 //a = (sin(dlat/2))^2 + cos(lat1) * cos(lat2) * (sin(dlon/2))^2
		 //c = 2 * atan2( sqrt(a), sqrt(1-a) )
		 //d = R * c (where R is the radius of the Earth)
		 double temp = 0;
		 return temp;
	 }
	 
	 
	 public static void main(String[] args)
	 {
	 	Position A = new Position(15, 11, 12, 'N', 21, 15, 31, 'W');
	 	Position B = new Position(30, 22, 24, 'N', 42, 30, 50, 'W');
	 	
	 	// Should print:  15¡ 11' 12" North
	 	System.out.println(A.getLatitude());
	 	
	 	// Should print:  21¡ 15' 31" West
	 	System.out.println(A.getLongitude());
	 	
	 	// Should print:  15¡ 11' 12" North, 21¡ 15' 31" West
	 	System.out.println(A.toString());
	 	
	 	//Should print:   15.186666666666667¼ North
	 	System.out.println(A.getLatitudeInDecimal());
	 	
	 	//Should print:   21.25861111111111¼ West
	 	System.out.println(A.getLongitudeInDecimal());
	 	
	 	System.out.println(A.getDistance(B));
	 	
	 	// Add code to test all of the other methods
	 	
	 	
	 }
	
}