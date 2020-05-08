
/**
 * Interface for Card Class
 * @author Mikae
 *
 */
public interface ICard {
	
	public Enum<Value> getValue();
	
	public Enum<Suit> getSuit();
	
	public Enum<Color> getColor();
		
	public void setVisibility(boolean v);
	
	public boolean getVisibility();
	
}
