
public class SimulatRandomPoints {

	public static void main(String[] args)
	{
		int numPoints = 1000000;
		double x;
		double y;
		double pi;
		double distance;
		int count = 0;
		double temp;
		for(int i=0; i<numPoints; i++)
		{
			x = Math.random()*2-1;
			y = Math.random()*2-1;
			distance = Math.sqrt((y*y)+(x*x));
			
			if(distance <= 1)
				count++;
		}
		temp = (double)count/numPoints;
		pi = 4*temp;
		System.out.println("pi - "+pi);
	}
	
}
