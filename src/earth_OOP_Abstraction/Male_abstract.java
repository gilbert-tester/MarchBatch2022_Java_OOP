package earth_OOP_Abstraction;

public abstract class Male_abstract {

	
	String maleName;
	
	String femaleName;
	
	String chefName;
	
	
	public void boilEgg () {
		
		System.out.println(maleName + " says, I can boid egg.. but nothing else.. ");
		
		
	}
	
	public abstract void thaiSoup(); // abstract method
	
	public abstract void biriyani(); // abstract method
	
	public abstract void srimpCurry();
	
}
