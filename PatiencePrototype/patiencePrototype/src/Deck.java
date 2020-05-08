import java.util.Collections;

/**
 * Deck class that extends Pile that does all of the creation of the Deck and its methods
 * @author Mikae
 *
 */
public class Deck extends Pile{
	
	
	/**
	 * Creates the full deck of 52 cards in order (NOT SHUFFLED)
	 */
	Deck() {
		
		for(Suit s : Suit.values()) {
			for (Value v : Value.values()) {
				pokerCards.add(new PokerCard(v,s));
			}
		}
	}
	
	/**
	 * Shuffles deck
	 */
	public void shuffle() {
		
		for(int i = 0; i < 6; i++) {
			Collections.shuffle(pokerCards);
		}
	}

	/**
	 * NOT USED
	 */
	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * NOT USED
	 */
	@Override
	public boolean rules(PokerCard c) {
		// TODO Auto-generated method stub
		return false;
	}
}
