import java.util.Scanner;

/**
 * Table which actually runs the game and does the game logic
 * @author Mikae
 *
 */
public class Table {

	public static void main(String[] args) {
	
		gameLogic();
}
	
/**
 * Runs the game until user wins	
 */
public static void gameLogic()
{
	try (Scanner sc = new Scanner(System.in)) {
		Player player = new Player();

		System.out.println("What is players name?");
		
		String p = sc.nextLine();

		player.setName(p);
		
		Deck deck = new Deck();
		deck.shuffle();
		
		Pile c1 = new Column();
		Pile c2 = new Column();
		Pile c3 = new Column();
		Pile c4 = new Column();
		Pile c5 = new Column();
		Pile c6 = new Column();
		Pile c7 = new Column();
		
		
		Pile f1 = new Foundation();
		Pile f2 = new Foundation();
		Pile f3 = new Foundation();
		Pile f4 = new Foundation();
		
		consoleOutput console = new consoleOutput();
		
		DiscardPile d1 = new DiscardPile();

		
		System.out.println("\n\nWelcome to Patience the game, " + player.getName());

		
		for (int i = 0; i <= 0; i++)
		{
			deck.moveCard(c1);
		}
		
		for (int i = 0; i <= 1; i++)
		{
			deck.moveCard(c2);
		}
		
		for (int i = 0; i <= 2; i++)
		{
			deck.moveCard(c3);
		}
		
		for (int i = 0; i <= 3; i++)
		{
			deck.moveCard(c4);
		}
		
		for (int i = 0; i <= 4; i++)
		{
			deck.moveCard(c5);
		}
		
		for (int i = 0; i <= 5; i++)
		{
			deck.moveCard(c6);
		}
		
		for (int i = 0; i <= 6; i++)
		{
			deck.moveCard(c7);
		}
		
		do {
			
			
			if (deck.size() == 0)
			{
				for(int i = 1; i < d1.size(); i++)
				{
				d1.moveCard(deck);
				}
				
				deck.shuffle();
			}
			
			System.out.println("\n\n\nFoundation 1");
			console.printFoundations(f1);
			System.out.println("\n\n\nFoundation 2");
			console.printFoundations(f2);
			System.out.println("\n\n\nFoundation 3");
			console.printFoundations(f3);
			System.out.println("\n\n\nFoundation 4");
			console.printFoundations(f4);

			
			System.out.println("\n\n\nDeck");
			console.printDeck(deck);
			
			System.out.println("\n\nColumn 1");
			console.printColumns(c1);	
			
			System.out.println("\n\nColumn 2");
			console.printColumns(c2);
			
			System.out.println("\n\nColumn 3");
			console.printColumns(c3);
				
			System.out.println("\n\nColumn 4");
			console.printColumns(c4);
				
			System.out.println("\n\nColumn 5");
			console.printColumns(c5);
				
			System.out.println("\n\nColumn 6");
			console.printColumns(c6);
				
			System.out.println("\n\nColumn 7");
			console.printColumns(c7);
			
			System.out.println("\t0 - DiscardPile");
			System.out.println("\t1 - Deck");
			System.out.println("\t2 - Column 1");
			System.out.println("\t3 - Column 2");
			System.out.println("\t4 - Column 3");
			System.out.println("\t5 - Column 4");
			System.out.println("\t6 - Column 5");
			System.out.println("\t7 - Column 6");
			System.out.println("\t8 - Column 7");
			System.out.println("\t9 - Foundation 1");
			System.out.println("\t10 - Foundation 2");
			System.out.println("\t11 - Foundation 3");
			System.out.println("\t12 - Foundation 4");

			
			System.out.println("\nWhat pile would you like to move a card from?");
			
			int from = sc.nextInt();


			System.out.println("\nWhat pile would you like to move card to?");

			int to = sc.nextInt();
			
			
			if(from == 1 && to == 0)
			{
				deck.moveCard(d1);
			}
			
			
			if(from == 1 && to == 2)
			{
				if(c1.rules(deck.pokerCards.get(0)) == true) 
				{
					deck.moveCard(c1);
				}
				else
				{
					System.out.println("Invalid Move");
				}			}
			if(from == 1 && to == 3)
			{
				if(c2.rules(deck.pokerCards.get(0)) == true) 
				{
					deck.moveCard(c2);
				}
				else
				{
					System.out.println("Invalid Move");
				}			}
			if(from == 1 && to == 4)
			{
				if(c3.rules(deck.pokerCards.get(0)) == true) 
				{
					deck.moveCard(c3);
				}
				else
				{
					System.out.println("Invalid Move");
				}			}
			if(from == 1 && to == 5)
			{
				if(c4.rules(deck.pokerCards.get(0)) == true) 
				{
					deck.moveCard(c4);
				}
				else
				{
					System.out.println("Invalid Move");
				}			}
			if(from == 1 && to == 6)
			{
				if(c5.rules(deck.pokerCards.get(0)) == true) 
				{
					deck.moveCard(c5);
				}
				else
				{
					System.out.println("Invalid Move");
				}			}
			if(from == 1 && to == 7)
			{
				if(c6.rules(deck.pokerCards.get(0)) == true) 
				{
					deck.moveCard(c6);
				}
				else
				{
					System.out.println("Invalid Move");
				}			}
			if(from == 1 && to == 8)
			{
				if(c7.rules(deck.pokerCards.get(0)) == true) 
				{
					deck.moveCard(c7);
				}
				else
				{
					System.out.println("Invalid Move");
				}			}
			if(from == 1 && to == 9)
			{
				if(f1.rules(deck.pokerCards.get(0)) == true) 
				{
					deck.moveCard(f1);
				}
				else
				{
					System.out.println("Invalid Move");
				}			}
			if(from == 1 && to == 10)
			{
				if(f2.rules(deck.pokerCards.get(0)) == true) 
				{
					deck.moveCard(f2);
				}
				else
				{
					System.out.println("Invalid Move");
				}			}
			if(from == 1 && to == 11)
			{
				if(f3.rules(deck.pokerCards.get(0)) == true) 
				{
					deck.moveCard(f3);
				}
				else
				{
					System.out.println("Invalid Move");
				}			}
			if(from == 1 && to == 12)
			{
				if(f4.rules(deck.pokerCards.get(0)) == true) 
				{
					deck.moveCard(f4);
				}
				else
				{
					System.out.println("Invalid Move");
				}	
			}
			
			
			
			if(from == 2 && to == 3)
			{
				if(c2.rules(c1.pokerCards.get(0)) == true) 
				{
					c1.moveCard(c2);
				}
				else
				{
					System.out.println("Invalid Move");
				}			}
			if(from == 2 && to == 4)
			{
				if(c3.rules(c1.pokerCards.get(0)) == true) 
				{
					c1.moveCard(c3);
				}
				else
				{
					System.out.println("Invalid Move");
				}			}
			if(from == 2 && to == 5)
			{
				if(c4.rules(c1.pokerCards.get(0)) == true) 
				{
					c1.moveCard(c4);
				}
				else
				{
					System.out.println("Invalid Move");
				}			}
			if(from == 2 && to == 6)
			{
				if(c5.rules(c1.pokerCards.get(0)) == true) 
				{
					c1.moveCard(c5);
				}
				else
				{
					System.out.println("Invalid Move");
				}			}
			if(from == 2 && to == 7)
			{
				if(c6.rules(c1.pokerCards.get(0)) == true) 
				{
					c1.moveCard(c6);
				}
				else
				{
					System.out.println("Invalid Move");
				}			}
			if(from == 2 && to == 8)
			{
				if(c7.rules(c1.pokerCards.get(0)) == true) 
				{
					c1.moveCard(c7);
				}
				else
				{
					System.out.println("Invalid Move");
				}			}
			if(from == 2 && to == 9)
			{
				if(f1.rules(c1.pokerCards.get(0)) == true) 
				{
					c1.moveCard(f1);
				}
				else
				{
					System.out.println("Invalid Move");
				}			}
			if(from == 2 && to == 10)
			{
				if(f2.rules(c1.pokerCards.get(0)) == true) 
				{
					c1.moveCard(f2);
				}
				else
				{
					System.out.println("Invalid Move");
				}			}
			if(from == 2 && to == 11)
			{
				if(f3.rules(c1.pokerCards.get(0)) == true) 
				{
					c1.moveCard(f3);
				}
				else
				{
					System.out.println("Invalid Move");
				}			}
			if(from == 2 && to == 12)
			{
				if(f4.rules(c1.pokerCards.get(0)) == true) 
				{
					c1.moveCard(f4);
				}
				else
				{
					System.out.println("Invalid Move");
				}
			}
			
			
			if(from == 3 && to == 2)
			{
				if(c1.rules(c2.pokerCards.get(0)) == true) 
				{
					c2.moveCard(c1);
				}
				else
				{
					System.out.println("Invalid Move");
				}			}
			if(from == 3 && to == 4)
			{
				if(c3.rules(c2.pokerCards.get(0)) == true) 
				{
					c2.moveCard(c3);
				}
				else
				{
					System.out.println("Invalid Move");
				}			}
			if(from == 3 && to == 5)
			{
				if(c4.rules(c2.pokerCards.get(0)) == true) 
				{
					c2.moveCard(c4);
				}
				else
				{
					System.out.println("Invalid Move");
				}			}
			if(from == 3 && to == 6)
			{
				if(c5.rules(c2.pokerCards.get(0)) == true) 
				{
					c2.moveCard(c5);
				}
				else
				{
					System.out.println("Invalid Move");
				}			}
			if(from == 3 && to == 7)
			{
				if(c6.rules(c2.pokerCards.get(0)) == true) 
				{
					c2.moveCard(c6);
				}
				else
				{
					System.out.println("Invalid Move");
				}			}
			if(from == 3 && to == 8)
			{
				if(c7.rules(c2.pokerCards.get(0)) == true) 
				{
					c2.moveCard(c7);
				}
				else
				{
					System.out.println("Invalid Move");
				}			}
			if(from == 3 && to == 9)
			{
				if(f1.rules(c2.pokerCards.get(0)) == true) 
				{
					c2.moveCard(f1);
				}
				else
				{
					System.out.println("Invalid Move");
				}			}
			if(from == 3 && to == 10)
			{
				if(f2.rules(c2.pokerCards.get(0)) == true) 
				{
					c2.moveCard(f2);
				}
				else
				{
					System.out.println("Invalid Move");
				}			}
			if(from == 3 && to == 11)
			{
				if(f3.rules(c2.pokerCards.get(0)) == true) 
				{
					c2.moveCard(f3);
				}
				else
				{
					System.out.println("Invalid Move");
				}			}
			if(from == 3 && to == 12)
			{
				if(f4.rules(c2.pokerCards.get(0)) == true) 
				{
					c2.moveCard(f4);
				}
				else
				{
					System.out.println("Invalid Move");
				}				}
			
			
			
			if(from == 4 && to == 2)
			{
				if(c1.rules(c3.pokerCards.get(0)) == true) 
				{
					c3.moveCard(c1);
				}
				else
				{
					System.out.println("Invalid Move");
				}				}
			if(from == 4 && to == 3)
			{
				if(c2.rules(c3.pokerCards.get(0)) == true) 
				{
					c3.moveCard(c2);
				}
				else
				{
					System.out.println("Invalid Move");
				}				}
			if(from == 4 && to == 5)
			{
				if(c4.rules(c3.pokerCards.get(0)) == true) 
				{
					c3.moveCard(c4);
				}
				else
				{
					System.out.println("Invalid Move");
				}				}
			if(from == 4 && to == 6)
			{
				if(c5.rules(c3.pokerCards.get(0)) == true) 
				{
					c3.moveCard(c5);
				}
				else
				{
					System.out.println("Invalid Move");
				}				}
			if(from == 4 && to == 7)
			{
				if(c6.rules(c3.pokerCards.get(0)) == true) 
				{
					c3.moveCard(c6);
				}
				else
				{
					System.out.println("Invalid Move");
				}				}
			if(from == 4 && to == 8)
			{
				if(c7.rules(c3.pokerCards.get(0)) == true) 
				{
					c3.moveCard(c7);
				}
				else
				{
					System.out.println("Invalid Move");
				}				}
			if(from == 4 && to == 9)
			{
				if(f1.rules(c3.pokerCards.get(0)) == true) 
				{
					c3.moveCard(f1);
				}
				else
				{
					System.out.println("Invalid Move");
				}				}
			if(from == 4 && to == 10)
			{
				if(f2.rules(c3.pokerCards.get(0)) == true) 
				{
					c3.moveCard(f2);
				}
				else
				{
					System.out.println("Invalid Move");
				}				}
			if(from == 4 && to == 11)
			{
				if(f3.rules(c3.pokerCards.get(0)) == true) 
				{
					c3.moveCard(f3);
				}
				else
				{
					System.out.println("Invalid Move");
				}				}
			if(from == 4 && to == 12)
			{
				if(f4.rules(c3.pokerCards.get(0)) == true) 
				{
					c3.moveCard(f4);
				}
				else
				{
					System.out.println("Invalid Move");
				}			}
			
			
			
			if(from == 5 && to == 2)
			{
				if(c1.rules(c4.pokerCards.get(0)) == true) 
				{
					c4.moveCard(c1);
				}
				else
				{
					System.out.println("Invalid Move");
				}			}
			if(from == 5 && to == 3)
			{
				if(c2.rules(c4.pokerCards.get(0)) == true) 
				{
					c4.moveCard(c2);
				}
				else
				{
					System.out.println("Invalid Move");
				}			}
			if(from == 5 && to == 4)
			{
				if(c3.rules(c4.pokerCards.get(0)) == true) 
				{
					c4.moveCard(c3);
				}
				else
				{
					System.out.println("Invalid Move");
				}			}
			if(from == 5 && to == 6)
			{
				if(c5.rules(c4.pokerCards.get(0)) == true) 
				{
					c4.moveCard(c5);
				}
				else
				{
					System.out.println("Invalid Move");
				}			}
			if(from == 5 && to == 7)
			{
				if(c6.rules(c4.pokerCards.get(0)) == true) 
				{
					c4.moveCard(c6);
				}
				else
				{
					System.out.println("Invalid Move");
				}			}
			if(from == 5 && to == 8)
			{
				if(c7.rules(c4.pokerCards.get(0)) == true) 
				{
					c4.moveCard(c7);
				}
				else
				{
					System.out.println("Invalid Move");
				}			}
			if(from == 5 && to == 9)
			{
				if(f1.rules(c4.pokerCards.get(0)) == true) 
				{
					c4.moveCard(f1);
				}
				else
				{
					System.out.println("Invalid Move");
				}			}
			if(from == 5 && to == 10)
			{
				if(f2.rules(c4.pokerCards.get(0)) == true) 
				{
					c4.moveCard(f2);
				}
				else
				{
					System.out.println("Invalid Move");
				}			}
			if(from == 5 && to == 11)
			{
				if(f3.rules(c4.pokerCards.get(0)) == true) 
				{
					c4.moveCard(f3);
				}
				else
				{
					System.out.println("Invalid Move");
				}			}
			if(from == 5 && to == 12)
			{
				if(f4.rules(c4.pokerCards.get(0)) == true) 
				{
					c4.moveCard(f4);
				}
				else
				{
					System.out.println("Invalid Move");
				}			}
			
			
			
			if(from == 6 && to == 2)
			{
				if(c1.rules(c5.pokerCards.get(0)) == true) 
				{
					c5.moveCard(c1);
				}
				else
				{
					System.out.println("Invalid Move");
				}			}
			if(from == 6 && to == 3)
			{
				if(c2.rules(c5.pokerCards.get(0)) == true) 
				{
					c5.moveCard(c2);
				}
				else
				{
					System.out.println("Invalid Move");
				}			}
			if(from == 6 && to == 4)
			{
				if(c3.rules(c5.pokerCards.get(0)) == true) 
				{
					c5.moveCard(c3);
				}
				else
				{
					System.out.println("Invalid Move");
				}			}
			if(from == 6 && to == 5)
			{
				if(c4.rules(c5.pokerCards.get(0)) == true) 
				{
					c5.moveCard(c4);
				}
				else
				{
					System.out.println("Invalid Move");
				}			}
			if(from == 6 && to == 7)
			{
				if(c6.rules(c5.pokerCards.get(0)) == true) 
				{
					c5.moveCard(c6);
				}
				else
				{
					System.out.println("Invalid Move");
				}			}
			if(from == 6 && to == 8)
			{
				if(c7.rules(c5.pokerCards.get(0)) == true) 
				{
					c5.moveCard(c7);
				}
				else
				{
					System.out.println("Invalid Move");
				}			}
			if(from == 6 && to == 9)
			{
				if(f1.rules(c5.pokerCards.get(0)) == true) 
				{
					c5.moveCard(f1);
				}
				else
				{
					System.out.println("Invalid Move");
				}			}
			if(from == 6 && to == 10)
			{
				if(f2.rules(c5.pokerCards.get(0)) == true) 
				{
					c5.moveCard(f2);
				}
				else
				{
					System.out.println("Invalid Move");
				}			}
			if(from == 6 && to == 11)
			{
				if(f3.rules(c5.pokerCards.get(0)) == true) 
				{
					c5.moveCard(f3);
				}
				else
				{
					System.out.println("Invalid Move");
				}			}
			if(from == 6 && to == 12)
			{
				if(f4.rules(c5.pokerCards.get(0)) == true) 
				{
					c5.moveCard(f4);
				}
				else
				{
					System.out.println("Invalid Move");
				}				
			}
			
			
			
			if(from == 7 && to == 2)
			{
				if(c1.rules(c6.pokerCards.get(0)) == true) 
				{
					c6.moveCard(c1);
				}
				else
				{
					System.out.println("Invalid Move");
				}				}
			if(from == 7 && to == 3)
			{
				if(c2.rules(c6.pokerCards.get(0)) == true) 
				{
					c6.moveCard(c2);
				}
				else
				{
					System.out.println("Invalid Move");
				}				}
			if(from == 7 && to == 4)
			{
				if(c3.rules(c6.pokerCards.get(0)) == true) 
				{
					c6.moveCard(c3);
				}
				else
				{
					System.out.println("Invalid Move");
				}				}
			if(from == 7 && to == 5)
			{
				if(c4.rules(c6.pokerCards.get(0)) == true) 
				{
					c6.moveCard(c4);
				}
				else
				{
					System.out.println("Invalid Move");
				}				}
			if(from == 7 && to == 6)
			{
				if(c5.rules(c6.pokerCards.get(0)) == true) 
				{
					c6.moveCard(c5);
				}
				else
				{
					System.out.println("Invalid Move");
				}	
			}
			if(from == 7 && to == 8)
			{
				if(c7.rules(c6.pokerCards.get(0)) == true) 
				{
					c6.moveCard(c7);
				}
				else
				{
					System.out.println("Invalid Move");
				}	
			}
			if(from == 7 && to == 9)
			{
				if(f1.rules(c6.pokerCards.get(0)) == true) 
				{
					c6.moveCard(f1);
				}
				else
				{
					System.out.println("Invalid Move");
				}	
			}
			if(from == 7 && to == 10)
			{
				if(f2.rules(c6.pokerCards.get(0)) == true) 
				{
					c6.moveCard(f2);
				}
				else
				{
					System.out.println("Invalid Move");
				}	
			}
			if(from == 7 && to == 11)
			{
				if(f3.rules(c6.pokerCards.get(0)) == true) 
				{
					c6.moveCard(f3);
				}
				else
				{
					System.out.println("Invalid Move");
				}	
			}
			if(from == 7 && to == 12)
			{
				if(f4.rules(c6.pokerCards.get(0)) == true) 
				{
					c6.moveCard(f4);
				}
				else
				{
					System.out.println("Invalid Move");
				}	
			}
			
			
			
			if(from == 8 && to == 2)
			{
				if(c1.rules(c7.pokerCards.get(0)) == true) 
				{
					c7.moveCard(c1);
				}
				else
				{
					System.out.println("Invalid Move");
				}	
			}
			if(from == 8 && to == 3)
			{
				if(c2.rules(c7.pokerCards.get(0)) == true) 
				{
					c7.moveCard(c2);
				}
				else
				{
					System.out.println("Invalid Move");
				}
			}
			if(from == 8 && to == 4)
			{
				if(c3.rules(c7.pokerCards.get(0)) == true) 
				{
					c7.moveCard(c3);
				}
				else
				{
					System.out.println("Invalid Move");
				}	
			}
			if(from == 8 && to == 5)
			{
				if(c4.rules(c7.pokerCards.get(0)) == true) 
				{
					c7.moveCard(c4);
				}
				else
				{
					System.out.println("Invalid Move");
				}	
			}
			if(from == 8 && to == 6)
			{
				if(c5.rules(c7.pokerCards.get(0)) == true) 
				{
					c7.moveCard(c5);
				}
				else
				{
					System.out.println("Invalid Move");
				}				}
			if(from == 8 && to == 7)
			{
				if(c6.rules(c7.pokerCards.get(0)) == true) 
				{
					c7.moveCard(c6);
				}
				else
				{
					System.out.println("Invalid Move");
				}	
			}
			if(from == 8 && to == 9)
			{
				if(f1.rules(c7.pokerCards.get(0)) == true) 
				{
					c7.moveCard(f1);
				}
				else
				{
					System.out.println("Invalid Move");
				}	
			}
			if(from == 8 && to == 10)
			{
				if(f2.rules(c7.pokerCards.get(0)) == true) 
				{
					c7.moveCard(f2);
				}
				else
				{
					System.out.println("Invalid Move");
				}	
			}
			if(from == 8 && to == 11)
			{
				if(f3.rules(c7.pokerCards.get(0)) == true) 
				{
					c7.moveCard(f3);
				}
				else
				{
					System.out.println("Invalid Move");
				}	
			}
			if(from == 8 && to == 12)
			{
				if(f4.rules(c7.pokerCards.get(0)) == true) 
				{
					c7.moveCard(f4);
				}
				else
				{
					System.out.println("Invalid Move");
				}	
			}
			
			
			
		}while(f1.isFull() == false && f2.isFull() == false && f3.isFull() == false && f4.isFull() == false);

		
		System.out.println("YOU WON!" + player.getName());
	}

	}		
}
