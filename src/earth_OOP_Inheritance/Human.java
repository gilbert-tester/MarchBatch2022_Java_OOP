package earth_OOP_Inheritance;

public class Human {

	public static void main(String[] args) {

		Male male = new Male();

		// Lets assign some value

		male.name = "Adam";
		male.age = 28;
		System.out.println("***************************** \n"); /* \n for adding new line */

		System.out.println("**** God's OOPs Theory ***** \n");

		Female female = new Female();
		female.name = "Eve";
		female.age = 25;

		male.loveCalculator();

		male.kids();
		female.kids();

	}

}
