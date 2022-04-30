package earth_OOP_Abstraction;

public abstract class Female_Abstract extends Male_abstract{
	
	
	@Override
	public void thaiSoup() {
		
	System.out.println(femaleName + " Okay! I can cook thai soup but nothing else...");	
		
	} 
	
	
	@Override
	public abstract void biriyani(); // abstract method
	
	@Override
	public abstract void srimpCurry();

}
