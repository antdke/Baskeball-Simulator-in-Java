// Anthony Dike
// March 17, 2018

/*

Constructor(aka initializer):
- String first
- String last
- int height
- int weight
- int agility
- int strength

object methods:
- fullName
- offRating
- defRating


*/

import java.text.MessageFormat;

public class Player {

	// data fields
	String first;
	String last;
	int height = 185;
	int weight = 80;
	int agility = 1;
	int strength = 1;

	/* constructor */
	Player(){
	}

	String fullName(String newFirst, String newLast) {
		first = newFirst;
		last = newLast;
		return MessageFormat.format("{0} {1}", first, last);

	}

	int setHeight(int newHeight){
		height = newHeight;
		return height;
	}

	int setWeight(int newWeight){
		weight = newWeight;
		return weight;
	}

	int setAgility(int newAgility){
		agility = newAgility;
		return agility;
	}

	int setStrength(int newStrength){
		strength = newStrength;
		return strength;
	}

	int offRating(int dribble, int jumpshot, int layup, int assist) {
		int totalOffRating = dribble + jumpshot + layup + assist;
		int avgOffRating = (int)((totalOffRating / 4) + ((totalOffRating % 4) / 4));
		return avgOffRating;
	}

	int defRating(int steal, int block){
		int totalDefRating = steal + block;
		int avgDefRating = (int)((totalDefRating / 2) + ((totalDefRating % 2) / 2));
		return avgDefRating;
	}




	//TEST: successful
	public static void main(String[] args){

		// Object aka instance 
		Player player1 = new Player();
		player1.setHeight(205);
		player1.setWeight(100);
		player1.setAgility(6);
		player1.setStrength(8);
		
		System.out.println();
		System.out.println("\nHi, my name is " + player1.fullName("Tony", "Douglass") + ".");
		System.out.println("I weigh " + player1.weight + "kg.");
		System.out.println("I am " + player1.height + "cm tall.");
		System.out.println("My agility rating is " + player1.agility);
		System.out.println("My strength rating is " + player1.strength);
		System.out.println("And my offensive rating (1 - 10) is " + 
			player1.offRating(6, 7, 8, 9) + ".");
		System.out.println("And my defensive rating (1 - 10) is " + 
			player1.defRating(6, 8) + ".\n");
		System.out.println();


	}


}

