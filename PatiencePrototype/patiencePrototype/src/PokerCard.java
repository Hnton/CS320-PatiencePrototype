/**
 * PokerCard that extends Card and implements the abstract card class
 * @author Mikae
 *
 */
public class PokerCard extends Card {

	/**
	 * Visibility of the card (Faceup - true, Facedown - false)
	 */
	private boolean visibility;
	
	/**
	 * Enum value of the card (Ace - King)
	 */
	private Enum<Value> value;
	
	/*
	 * Enum suit of the card (Diamond, Spade, ....)
	 */
	private Enum<Suit> suit;
	
	/**
	 * Enum color for the cards (Red, Black)
	 */
	private Enum<Color> color;
	
	/**
	 * Default Constructor 
	 */
	public PokerCard()
	{
		visibility = false;
		value = Value.Ace;
		suit = Suit.Hearts;
		color = Color.Red;
	}
	
	/**
	 * Constructor that takes in the parameters Value and Suit
	 */
	public PokerCard(Value v, Suit s)
	{
		value = v;
		suit = s;
	}
	
	/**
	 * Gets the value enum for the card
	 */
	public Enum<Value> getValue() {
		return value;
	}

	/**
	 * Gets the suit of the card
	 */
	public Enum<Suit> getSuit() {
		return suit;
	}

	/**
	 * Gets the color of the card
	 */
	public Enum<Color> getColor() {
		
		if(suit == Suit.Spades || suit == Suit.Clubs)
		{
			color = Color.Black;
		}
		else
		{
			color = Color.Red;
		}
	return color;
	}
	
	/**
	 * Is the card Faceup or FaceDown
	 */
	public boolean getVisibility() {
		return visibility;
	}

	/**
	 * Sets the Visibility of the Card
	 */
	public void setVisibility(boolean v) {
		visibility = v;
	}
	
	/**
	 * If the visibility is true then returns the card, if visibility is false then returns
	 *  Bicycle which is the back of the card
	 */
	public String toString() {
		
		if (visibility == true)
		{
			return value + " of " + suit + "\n";
		}
		else
		{
			return "Bicycle\n";
		}
	}
}
