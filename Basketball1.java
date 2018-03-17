// Anthony Dike started: 3/2/18
//
// This is VERSION 1 of a program that
// will simulate basketball games like NBA 2k.

import java.util.Random;

/*
Steps:

1) Initialize team variables and max and min scores
2) Create Random class
3) Assign random int to team variables
4) Convert team int value to string
5) When program runs, print team scores.

*/

public class Basketball1 {
	
	public static void main(String[] arguments){

		// initialize
		int Team1, Team2;
		int max = 122;
		int min = 98;

		// andom class
		Random rand = new Random();

		// assign ints to team variables
		Team1 = rand.nextInt(max - min) + min;
		Team2 = rand.nextInt(max - min) + min;

		// convert int to string
		String team1Value = Integer.toString(Team1);
		String team2Value = Integer.toString(Team2);

		// print scores
		System.out.println();
		System.out.println("SCORE: Team1 - " + team1Value + " Team2 - " + team2Value);
		System.out.println();

	}
}




