package earth_OOP_Polimorphism_Overriding;

public class Boy extends Female{

	
	@Override
	public void eatByMouth() {
			
			System.out.println("My name is " + name);
			System.out.println(", My favorite food is "+ favFood);
			
			System.out.println(", and I love to "+ wayToEat + " " + favFood+ "\n");
			
			
			
		}
	
	
}
