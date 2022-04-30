package earth_OOP_Inheritance;

public class Male {

	// Lets write some attributes for Male..

	String name;
	int age;

	String gender = "boy";

	public void loveCalculator() {

		int a = 5;
		int b = 4;

		int love = a + b;

		System.out.println(" Out of ten our love is " + love);

		System.out.println(name + " Says, lets plan for a baby.");

		System.out.println("*********************************");

	}

	public void kids() {

		System.out.println(name + " says I want a " + gender);

	}

}
