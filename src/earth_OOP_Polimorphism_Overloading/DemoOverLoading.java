package earth_OOP_Polimorphism_Overloading;

public class DemoOverLoading {

	public void motorCycle(int age, String passenger, String passenger1, String passenger2, String passenger3) {

		System.out.println("First Passenger " + passenger);
		System.out.println("Second Passenger " + passenger1);
		System.out.println("Third Passenger " + passenger2);
		System.out.println("Fourth Passenger " + passenger3);
		System.out.println("Age is " + age + "\n");

	}

	public void motorCycle(String passenger, String passenger1, String passenger2, String passenger3) {

		System.out.println("First Passenger " + passenger);
		System.out.println("Second Passenger " + passenger1);
		System.out.println("Third Passenger " + passenger2);
		System.out.println("Fourth Passenger " + passenger3 + "\n");

	}

}
