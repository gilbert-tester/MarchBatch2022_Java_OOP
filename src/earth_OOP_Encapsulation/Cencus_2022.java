package earth_OOP_Encapsulation;

public class Cencus_2022 {

	public static void main(String[] args) {

		Adam_Family p1 = new Adam_Family();
		Adam_Family p2 = new Adam_Family();
		Adam_Family p3 = new Adam_Family();
		Adam_Family p4 = new Adam_Family();

		p1.setName("Uncle Adam");
		p1.setAge(68);
		p1.setGender("Male");

		System.out.println("Name of the Head of House Hold " + p1.getName());
		System.out.println("Age of the Head of House Hold " + p1.getAge());
		System.out.println("Gender of the Head of House Hold " + p1.getGender());
		System.out.println("*******************************************\n");

		p2.setName("Aunty Eve");
		p2.setAge(65);
		p2.setGender("Female");

		System.out.println("Name of the 2nd Head of House Hold " + p2.getName());
		System.out.println("Age of the 2nd Head of House Hold " + p2.getAge());
		System.out.println("Gender of the 2nd Head of House Hold " + p2.getGender());
		System.out.println("*******************************************\n");

		p3.setName("Tom Cruize");
		p3.setAge(3);
		p3.setGender("Male");

		System.out.println("Name of the 1st child " + p3.getName());
		System.out.println("Age of the 1st child  " + p3.getAge());
		System.out.println("Gender of of the 1st child  " + p3.getGender());
		System.out.println("*******************************************\n");

		p4.setName("Julia Roberts");
		p4.setAge(2);
		p4.setGender("Female");

		System.out.println("Name of the 2nd child " + p4.getName());
		System.out.println("Age of the 2nd child  " + p4.getAge());
		System.out.println("Gender of of the 2nd child  " + p4.getGender());
		System.out.println("*******************************************\n");

	}

}
