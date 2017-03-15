import java.util.ArrayList;
import java.util.Random;

public class DeckOfCards {

	private ArrayList<String> deck;
	private static char[] values = {'A', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'J', 'Q', 'K'};
	private static char[] suits = {'D', 'C', 'H', 'S'};
	
	public DeckOfCards()
	{
		deck = new ArrayList<String>();
		for(int s=0; s<suits.length; s++)
		{
			for(int v=0; v<values.length; v++)
			{
				String temp = "" + values[v] +suits[s];
				deck.add(temp);
			}
		}
	}
	
	//  precondition: 
	// postcondition: returns a hand of n cards (as an ArrayList<String>)
	// 		dealt (without replacement) from a standard deck of cards
	public ArrayList<String> dealNCards(int n)
	{
		ArrayList<String> cardsDealt = new ArrayList<String>();
		for(int i=0; i<n; i++)
		{
			int tempIndex = (int)(Math.random() * deck.size());
			cardsDealt.add(deck.remove(tempIndex));
		}
		return cardsDealt;
	}
	
	public static boolean onePair(ArrayList<String> hand)
	{
		for(int a=0; a<hand.size(); a++)
		{
			for(int b=a+1; b<hand.size(); b++)
			{
				if(hand.get(a).charAt(0) == hand.get(b).charAt(0))
				{
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean threeOfKind(ArrayList<String> hand)
	{
		for(int a=0; a<hand.size(); a++)
		{
			for(int b=a+1; b<hand.size(); b++)
			{
				if(hand.get(a).charAt(0) == hand.get(b).charAt(0))
				{
					b++;
					if(b<hand.size())
					{
						if(hand.get(a).charAt(0) == hand.get(b).charAt(0))
						{
							return true;
						}
					}
				}
			}
		}
		return false;
	}
	
	public static boolean fourOfKind(ArrayList<String> hand)
	{
		for(int a=0; a<hand.size(); a++)
		{
			for(int b=a+1; b<hand.size(); b++)
			{
				if(hand.get(a).charAt(0) == hand.get(b).charAt(0))
				{
					b++;
					if(b<hand.size())
					{
						if(hand.get(a).charAt(0) == hand.get(b).charAt(0))
						{
							b++;
							if(b<hand.size())
							{
								if(hand.get(a).charAt(0) == hand.get(b).charAt(0))
								{
									return true;
								}
							}
						}
					}
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args)
	{
		//Probability in a five card hand (Replacing cards)
		double trials = 1000000;
		double count = 0;
		for(int i=0; i<trials; i++)
		{
			DeckOfCards newDeck = new DeckOfCards();
			ArrayList<String> hand = newDeck.dealNCards(5);
			if(onePair(hand) == true)
				count = count + 1;
		}
		System.out.println("Probability of one pair in a 5 card hand: "+((count/trials)*100));
		System.out.println("\n");
		
		//Probability for 2b.
		trials = 1000000;
		double countHand1 = 0;
		double countHand2 = 0;
		for(int i=0; i<trials; i++)
		{
			DeckOfCards newDeck = new DeckOfCards();
			ArrayList<String> hand1 = newDeck.dealNCards(5);
			ArrayList<String> hand2 = newDeck.dealNCards(5);
			if(onePair(hand1) == true)
				countHand1 = countHand1 + 1;
			if(onePair(hand2) == true)
				countHand2 = countHand2 + 1;
		}
		System.out.println("Probability of one pair in the first 5 card hand: "+((countHand1/trials)*100));
		System.out.println("Probability of one pair in the second 5 card hand: "+((countHand2/trials)*100));
		System.out.println("\n");
		
		//Probability for 3
		trials = 1000000;
		for(int i=3; i<=7; i++)
		{
			count = 0;
			
			for(int a=0; a<trials; a++)
			{
				DeckOfCards newDeck = new DeckOfCards();
				ArrayList<String> hand = newDeck.dealNCards(i);
				if(threeOfKind(hand) == true)
				{
					count = count + 1;
				}	
			}
			System.out.println("Probability for a hand of "+i+" cards = "+((count/trials)*100));
		}
	}
}