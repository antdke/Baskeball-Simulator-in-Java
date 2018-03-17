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

	/* constructor */
	Player(String first, String last, int height, int weight, int agility, int strength){
	}

	String fullName(String newFirst, String newLast) {
		return MessageFormat.format("{0} {1}", newFirst, newLast);
	}

	int offRating(int dribble, int jumpshot, int layup, int assist) {
		int totalOffRating = dribble + jumpshot + layup + assist;
		double avgOffRating = (totalOffRating / 4.0) + (totalOffRating % 4.0)
	}





	//TEST: successful
	public static void main(String[] args){

		Player player1 = new Player("Tony", "Douglass", 205, 100, 6, 6);
		player1.fullName("Tony", "Douglass");

		System.out.println(player1.fullName("Tony", "Douglass"));
	}


}

