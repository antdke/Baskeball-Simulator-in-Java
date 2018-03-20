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
		// initialize
		int maxScore = 20;
		int minScore = 0;

		// random class
		Random rand = new Random();

		// assign ints to team variables
		Team1 = rand.nextInt(maxScore - minScore) + minScore; // Do i still need to  have this 
		Team2 = rand.nextInt(maxScore - minScore) + minScore;

		// convert int to string
		String team1Value = Integer.toString(Team1);
		String team2Value = Integer.toString(Team2);
		String overtimeTeam1 = Integer.toString(OvertimeTeam1());
		String overtimeTeam2 = Integer.toString(OvertimeTeam2());
		
		// This is needed, might have to erase above
		
		player1.freeThrow();
		player2.freeThrow();
		
		
		// need to display who won



	}
	
	public int freeThrow {
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
		shotsMade = ((shooting / 2) * 10) + (int)(Math.random() * (shooting / 2) * 10)); //Might have to be in own meth
			
		return shotsMade;
	}

	public class Player {

		// data fields
		String first;
		String last;
		private int shooting = 1;
		private int maxShooting = 10;

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
		
		void score(){ // used to have each object keep track of its score
		
		}

	}

}

