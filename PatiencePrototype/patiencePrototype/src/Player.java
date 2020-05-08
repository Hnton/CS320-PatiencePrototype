/**
 * Player and adds name
 * @author Mikae
 *
 */
public class Player {

	/**
	 * Player name
	 */
	private String name;
	
	/**
	 * Overloaded Constructor
	 * @param n
	 */
	public Player() {
		name = "Mikael";
	}
	
	/**
	 * Returns the name of the player
	 * @return
	 */
	public String getName() {
		
		return name;
	}
	
	/**
	 * Sets the name of the player
	 * @param n
	 */
	public void setName(String n) {
		name = n;
	}
}
