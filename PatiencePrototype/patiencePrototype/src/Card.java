
/**
 * Abstract Card Class that implements ICard
 * @author Mikae
 *
 */
public abstract class Card implements ICard{
	
	/**
	 * Gets the value enum for the card
	 */
	public abstract Enum<Value> getValue();

	/**
	 * Gets the suit of the card
	 */
	public abstract Enum<Suit> getSuit();

	/**
	 * Gets the color of the card
	 */
	public abstract Enum<Color> getColor();
	
	/**
	 * Gets the visibility of the card selected
	 */
	public abstract boolean getVisibility();

	/**
	 * Sets the visibility of the card selected
	 */
	public abstract void setVisibility(boolean v);
}
