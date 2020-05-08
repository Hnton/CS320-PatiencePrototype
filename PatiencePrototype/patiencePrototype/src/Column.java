/**
 * Column Class that implements the rules for the cards being moved to that column
 * @author Mikae
 *
 */
public class Column extends Pile {

	/**
	 * NOT IMPLEMENTED
	 */
	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Rule that if true then the card can enter the column, if not then it can not be moved to the column
	 */
	@Override
	public boolean rules(PokerCard c) {
		 
		if((pokerCards.size() == 0 && c.getValue() == Value.King) || (pokerCards.get(0).getValue().ordinal() - 1 == c.getValue().ordinal() && pokerCards.get(0).getColor() != c.getColor()))
		{
			return true;
		}
	return false;
	}	
}
