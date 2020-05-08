import java.util.ArrayList;

public abstract class Pile implements IPile {

	/**
	 * Keeps all of the cards in the deck, foundation, column and discardPile
	 */
	public ArrayList<PokerCard> pokerCards = new ArrayList<PokerCard>();

	/**
	 * Adds PokerCard to the arraylist
	 * Returns true if added
	 * Returns false if not added
	 */
	public boolean add( PokerCard p) {

		pokerCards.add(0, p);
		
		if(pokerCards.contains(p))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * Removes the top PokerCard on the Arraylist
	 * Returns true if success
	 * Returns false if not successful
	 */
	public boolean removeCard() {
		
		int beforeSize;
		int afterSize;
		
		beforeSize = pokerCards.size();
		pokerCards.remove(0);
		afterSize = pokerCards.size();
		
		if(beforeSize - 1 == afterSize)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * Removes all cards from ArrayList
	 * Returns true if size is 0
	 * Returns false if size is not 0
	 */
	public boolean removeAll() {

		pokerCards.removeAll(pokerCards);
		
		if (pokerCards.size() == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	/**
	 * Moves top card of arraylist to the top card of the other arraylist
	 * Return true if success
	 * Returns false if not successful
	 */
	public boolean moveCard(Pile p) {

		PokerCard move = new PokerCard();
				
		move = pokerCards.get(0);
		
		int pSizeBefore = p.size();
		
		p.add(move);
		
		int pSizeAfter = p.size();

		pokerCards.remove(0);
		
		if(pSizeBefore + 1 == pSizeAfter)
		{
			return true;
		}
		else
		{
			return false;	
		}
	}
	
	/**
	 * Returns the size of the arraylist
	 */
	public int size() {
		
		return pokerCards.size();
	}
	
	/**
	 * Sees if that pile is full or not
	 * @return
	 */
	public abstract boolean isFull();

	/**
	 * Rules for if the card can be added to that pile
	 * @return
	 */
	public abstract boolean rules(PokerCard p);
	
	/**
	 * ToString to print out the list of the cards in a arraylist
	 */
	public String toString() {
		return pokerCards.toString() + "\n";
	}
}
