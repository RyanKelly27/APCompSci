import java.util.Random;


public class DiceRollSimulation {

	public static void main(String[] args)
	{
		Random generator = new Random();
		int roll1;
		int roll2;
		int total;
		int[] counter = new int[11];
		
		for(int i=0; i<1000; i++)
		{
			roll1 = generator.nextInt(6) + 1;
			roll2 = generator.nextInt(6) + 1;
			total = roll1 + roll2;
			
			if(total == 2)
				counter[0]++;
			else if(total == 3)
				counter[1]++;
			else if(total == 4)
				counter[2]++;
			else if(total == 5)
				counter[3]++;
			else if(total == 6)
				counter[4]++;
			else if(total == 7)
				counter[5]++;
			else if(total == 8)
				counter[6]++;
			else if(total == 9)
				counter[7]++;
			else if(total == 10)
				counter[8]++;
			else if(total == 11)
				counter[9]++;
			else if(total == 12)
				counter[10]++;
		}
		
		double prob;
		for(int i=0; i<11; i++)
		{
			prob = counter[i] / 1000.0;
			System.out.println(i+2 +" - "+counter[i]+" times - probability = "+prob);
		}
		
	}
	
}
