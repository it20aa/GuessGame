//Author: ILene
//From Head First Java
//Example from page 39 - 40
//** Had to fix, all clases were public and caused a problem.


public class GuessGamer {
	Player p1;
	Player p2;
	Player p3;
	
	public void startGame () {
		p1 = new Player ();
		p2 = new Player ();
		p3 = new Player ();
		
		int guessp1 = 1;
		int guessp2 = 4;
		int guessp3 = 8;
		
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;
		
		int targetNumber = 4 ;//(int) (Math.random() * 10);
		System.out.println ("I'm thinking of a number between 0 and 9...");
	
		while (true) {
			System.out.println("Number to guess is " + targetNumber);
		p1.guess();
		p2.guess();
		p3.guess();
		
		guessp1 = p1.number;
		System.out.println("Player one guessed " + guessp1);
		
		guessp2 = p2.number;
		System.out.println("Player two guessed " + guessp2);
		
		guessp3 = p3.number;
		System.out.println("Player three guessed " + guessp3);
		
		if (guessp1 == targetNumber ) {
			p1isRight = true;
		}
		if (guessp2 == targetNumber) {
			p2isRight = true;
		}
		if (guessp2 == targetNumber) {
			p3isRight = true;
		}
		if (p1isRight || p2isRight || p3isRight) {
			System.out.println ("We have a winner");
			System.out.println ("Player one got it right? " + p1isRight);
			System.out.println ("Player two got it right? " + p2isRight);
			System.out.println ("Player three got it right? " + p3isRight);
			System.out.println ("Game is over!");
			break;
		} else {
			
			System.out.println ("Players will have to try again.");
				}
		}
		}
	}


class Player {
	int number = 0; 

public void guess () {
	number = (int) (Math.random()*10);
	System.out.println("I'm guesing " + number);
	
	}	
}
class GameLauncher {
	public static void main (String[] args) {
	GuessGamer game = new GuessGamer ();
	game.startGame();
	
	}
}