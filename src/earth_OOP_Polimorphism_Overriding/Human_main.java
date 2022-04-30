package earth_OOP_Polimorphism_Overriding;

public class Human_main {

	public static void main(String[] args) {

		Male male = new Male ();
		male.name = "Adam";
		male.favFood ="Coffee";
		male.wayToEat ="Drinking";
		male.eatByMouth(); // same method different class
		
		Female female = new Female();
		
		female.name = "Eve";
		female.favFood ="Ice Cream";
		female.wayToEat = "Licking";
		female.eatByMouth();// same method different class
		
		Boy boy = new Boy();
		
		boy.name = "Tom";
		boy.favFood = "Chocolate";
		boy.wayToEat = "Munching";
		boy.eatByMouth();// same method different class
		
		
		
		
		
		
		
		
	}

}
