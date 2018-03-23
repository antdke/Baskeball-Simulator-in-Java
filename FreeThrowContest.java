import java.util.Random;
import java.util.Scanner;
import java.text.MessageFormat;


public class FreeThrowContest {
	
	public static void main(String[] arguments){

		// 				EXAMPLE OF A PLAYER
		//				metric system used

		// min 185cm:6ft - mid 200cm:6'6ft - max 220cm:7'2ft
		// min 80kg:175lbs - mid 100kg:220lbs - max 145kg:320lbs
		// all attribute stats are out of 10 points.

		// Object aka instance 
		Player player1 = new Player();
		player1.setFirstName("Tony");
		player1.setLastName("Douglass");
		player1.setShooting(7);

		Player player2 = new Player();
		player2.setFirstName("Allan");
		player2.setLastName("Zou");
		player1.setShooting(9);
		

		



		// welcome message
		System.out.println();
		System.out.println("----------------------------------------------");
		System.out.println("| HELLO, WELCOME TO THE FREE THROW CONTEST!  |");
		System.out.println("----------------------------------------------");
		System.out.println();

		Scanner in = new Scanner(System.in);

		boolean proceed = false;

		while(proceed == false){

			System.out.println("\t Would you like to start a game?");
    		System.out.println();
    		System.out.print("(YES or NO): ");
    		String answer = in.nextLine();
    		System.out.println();

    		if (answer.equals("yes")){
    			System.out.println();
    			Game();
    			System.out.println();

    		} else if (answer.equals("no")){
    			proceed = true;
    			break;

    		} else {
    			System.out.println("INVALID INPUT. Try Again.");
    			System.out.println();
    		}
		}

		// closing message
		System.out.println();
		System.out.println("----------------------------------------------");
		System.out.println("|       GOODBYE, THANK YOU FOR PLAYING!      |");
		System.out.println("----------------------------------------------");
		System.out.println();
	}


	public static void Game(){
		/*/ initialize
		int maxScore = 20;
		int minScore = 0;

		// assign ints to team variables
		Team1 = rand.nextInt(maxScore - minScore) + minScore; // Do i still need to  have this 
		Team2 = rand.nextInt(maxScore - minScore) + minScore; */

		// random class
		Random rand = new Random();

		// convert int to string
		String player1ScoreString = Integer.toString(player1Score);
		String player2ScoreString = Integer.toString(player2Score);
		//String overtimeTeam1 = Integer.toString(OvertimeTeam1());
		//String overtimeTeam2 = Integer.toString(OvertimeTeam2());
		
		// This is needed, might have to erase above
		
		player1.freeThrow();
		player2.freeThrow();

		int player1Wins;
		int player2Wins;
		
		
		// need to display who won
		int player1Score = player1.freeThrow();
		int player2Score = player2.freeThrow();

		if (player1Score > player2Score) {
			System.out.println("Player1 won the free throw contest!");
			System.out.println("Player1 had a score of " + player1ScoreString);
			System.out.println("Player2 scored " + player2ScoreString);
			player1Wins++;

		} else {
			System.out.println("Player2 won the free throw contest!");
			System.out.println("Player2 had a score of " + player2ScoreString);
			System.out.println("Player1 scored " + player1ScoreString);
			player2Wins++;
		}

		System.out.println();

		//int player1Wins = player1.score();
		//int player2Wins = player2.score();

		String player1WinsString = Integer.toString(player1Wins);
		String player2WinsString = Integer.toString(player2Wins);

		System.out.println("Player1 wins: " + player1WinsString);
		System.out.println("Player2 wins: " + player2WinsString);
		gameCounter++; 

		System.out.println();
	}
	
	public int freeThrow(){
		// First Player challenge: Free Throw Shooting
		
		// random value range 1 - 100 if var shooting = 1
		// every increase of shooting by 2 increases the min value in the random range by 20
		
		int maxShotsMade = 100; // max amount of free throws to be shot
		int minShotsMade = 1;
		int shotsMade;
		
		/*/ WHat I wanna do: The higher shooting is the higher the min range of the random range is
		// something else has to be done here
		for (int i = shooting; i <= maxShooting; i += 2){
			shotsMade = rand.nextInt(maxShotsMade - minShotsMade) + (minShotsMade * (i * 10));
		}
		*/
		
		// second for loop that could work: WAIT what if I DONT NEED A FOR LOOP?
		//Might have to be in own meth
		shotsMade = ((shooting / 2) * 10) + (int)(Math.random() * (shooting / 2) * 10); 
			
		return shotsMade;
	}

	class Player {

		// data fields
		String first;
		String last;
		private int shooting = 1;
		private int maxShooting = 10;
		int gameCounter = 0;

		/* constructor */
		public Player(){
		}

		String fullName() {
			return MessageFormat.format("{0} {1}", first, last);

		}

		String setLastName(String lastName){
			last = lastName;
			return last;
		} 

		String setFirstName(String firstName){
			first = firstName;
			return first;
		}

		int setShooting(int newShooting){
			shooting = newShooting;
			return shooting;
		}
		
		/*void score(){ // used to have each object keep track of its score
			
		}*/
	}
}

