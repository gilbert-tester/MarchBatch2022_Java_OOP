package earth_OOP_Abstraction;

public class Main {

	public static void main(String[] args) {

		Cook cook = new Cook();

		cook.maleName = "Adam";
		cook.femaleName = "Eve";
		cook.chefName = "Tom";

		cook.boilEgg();
		cook.thaiSoup();
		cook.biriyani();
		cook.srimpCurry();

	}

}
