package cardgameweek4;
/**
 * Starter code for the Card class.
 * To be used in Week 4.
 * @author dancye, 2019
 * Modifier Khusboo Shaivi Balloo , 2021 
 * ID: 991614490
 */
public class Card {

    /**
     *Class Card and Class CardHand are loosely coupled, 
     * there is no dependency between these two classes
     * if we have to change anything in class Card 
     * then we don't have to change anything in class CardHand
     * In loosely coupled classes, if changes are made , 
     * it will affect only a few parts of the classes.
     * That is why the original Card code was reused to make the uno desk with
     * only a few changes.
     * 
     * The use of enumeration makes it easier to add a layer of coupling 
     * if we want to change it.
     * 
     */
    
        
       public enum Color {RED, YELLOW, GREEN, BLUE};
       public enum Value{ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, SKIP, REVERSE, DRAWTWO, DRAWFOUR, WILDCARD};
        private final Color color;
        private final Value value;
	
	
        
        public Card(Color c, Value gVal)
        {
           color  = c;
           value= gVal;
        }
        
        public Color getColor() {
        return this.color;
    }
	public Value getValue() {
		return this.value;
	}

	public void getAttribute() {
		// TODO - implement Card.getAttribute
		throw new UnsupportedOperationException();
	}

	
	
}