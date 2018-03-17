// Anthony Dike started: 3/3/18
//
// This is VERSION 2 of a program that
// will simulate basketball games like NBA 2k.
//
// In this version I will add a welcome and closing message
// & add a feature that adds an overtime to the game
// if the score is tied after the regulation time.

import java.util.Random;
import java.util.Scanner;

/*
Steps:
1) split code labor into methods
2) OvertimeTeam1 & 2 - random added int amount to score
3) Game - add if else for overtime trigger 
4) Main - print welcome & closing messages & if yes play else if no break
*/

public class Basketball2 {
	// global variables
	public static int Team1;
	public static int Team2;

	public static int OvertimeTeam1(){
		Random rand = new Random();
		//Overtime increases maxScore # of points by 30
		int overtimeAdder = rand.nextInt(30);
		int team1OT = Team1 + overtimeAdder;
		return team1OT;

	}
	public static int OvertimeTeam2(){
		Random rand = new Random();
		//Overtime increases maxScore # of points by 30
		int overtimeAdder = rand.nextInt(30);
		int team2OT = Team2 + overtimeAdder;
		return team2OT;

	}
	public static void Game(){
		// initialize
		int maxScore = 122;
		int minScore = 98;

		// random class
		Random rand = new Random();

		// assign ints to team variables
		Team1 = rand.nextInt(maxScore - minScore) + minScore;
		Team2 = rand.nextInt(maxScore - minScore) + minScore;

		// convert int to string
		String team1Value = Integer.toString(Team1);
		String team2Value = Integer.toString(Team2);
		String overtimeTeam1 = Integer.toString(OvertimeTeam1());
		String overtimeTeam2 = Integer.toString(OvertimeTeam2());

		if (Team1 == Team2){
			System.out.println("There was an overtime!");
			System.out.println("REGULATION: Team1 - " + team1Value + 
				" Team2 - " + team2Value);
			//prints overtime
			System.out.println("OVERTIME: Team 1 - " + overtimeTeam1 + 
				" Team 2 - " + overtimeTeam2);
		} else {
			System.out.println("SCORE: Team1 - " + team1Value + " Team2 - " + team2Value);
		}

	}
	
	public static void main(String[] arguments){
		// welcome message
		System.out.println();
		System.out.println("----------------------------------------------");
		System.out.println("| HELLO, WELCOME TO THE BASKETBALL SIMULATOR |");
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



}
