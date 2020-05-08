/**
 * Foundation Class that implements the rules for if a card can be added to that foundation or not
 * @author Mikae
 *
 */
public class Foundation extends Pile{

	/**
	 * Returns true of foundation size is 13 which would mean all cards for that suit are in that foundation
	 */
	@Override
	public boolean isFull() {

		if(pokerCards.size() == 13)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	/**
	 * Rules if true then the card can be added to the foundations, false if it can not be added
	 */
	@Override
	public boolean rules(PokerCard p) {

		if((pokerCards.size() == 0) && (p.getValue() == Value.Ace)) 
		{	
			return true;
		}
		if(pokerCards.size() > 0) 
		{
			Card top = pokerCards.get(0);
			if(top.getSuit() == p.getSuit() && top.getValue().ordinal() + 1 == p.getValue().ordinal())
			{
				return true;
			}
		}	
		return false;
	}
}
