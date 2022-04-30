package earth_OOP_Abstraction;

public class Cook extends Female_Abstract {

	@Override
	public void biriyani() {

		System.out.println(chefName + " says, Master!! I can cook Haji Biriyani and also Hydrerabadi Biriyani...");

	}

	@Override
	public void srimpCurry() {

		System.out.println(chefName + " also says, Master I can cook Shrimp Curry too.. ");

	}

}
