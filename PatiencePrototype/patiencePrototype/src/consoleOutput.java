/**
 * Class that creates methods to output the deck, columns and foundations to the screen easier
 * @author Mikae
 *
 */
public class consoleOutput {

	/**
	 * Prints the first 3 cards on the deck, first card face up
	 * @param d
	 */
	public void printDeck(Pile d) {
		
		if (d.pokerCards.size() == 0)
		{
			return;
		}
		else
		{
			d.pokerCards.get(0).setVisibility(true);
		
			for(int i = 0; i < 3; i++)
			{
				System.out.print(d.pokerCards.get(i).toString());
			}
		}
	}
	
	/**
	 * Prints all of the cards in the columns; first card face up
	 * @param c
	 */
	public void printColumns(Pile c) {
		
		if (c.pokerCards.size() == 0)
		{
			return;
		}
		else
		{
			c.pokerCards.get(0).setVisibility(true);
	
			for(int i = 0; i < c.size(); i++)
			{
				System.out.print(c.pokerCards.get(i).toString());
			}
		}
	}
	
	/**
	 * Prints all of the cards in the foundations, first card face up
	 * @param f
	 */
	public void printFoundations(Pile f) {
		
		if (f.pokerCards.size() == 0)
		{
			return;
		}
		else
		{
			f.pokerCards.get(0).setVisibility(true);
	
			for(int i = 0; i < f.size(); i++)
			{
				for(int j = 1; j < f.size(); j++)
				{
					f.pokerCards.get(j).setVisibility(false);
				}
				System.out.print(f.pokerCards.get(i).toString());
			}
		}
	}
		
}
