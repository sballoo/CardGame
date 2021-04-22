package cardgameweek4;
/**
 * a class that models the Card Hand.
 * A Card hand has an array of cards. 
 * How can you change the size of the hand? how big is it right now?
 * @author dancye, 2019.
 */

public class CardHand {

        private static int handSize = 60;
	public static Card[] cards = new Card[handSize];
	
        /**
         * Add comments during class to explain what this method does.
         */
        /**
	 * This method 
	 */
        
        public static void generateHand(){
                //Create an array to store the cards
        {
                int countCards = 0;
		for(Card.Color c: Card.Color.values())
                {
                    for(Card.Value v: Card.Value.values())
                    {
                      
                      cards[countCards] = (new Card(c,v));
                        
                        countCards++;
                    }
                }//end outter for
        }//end method
        }
}