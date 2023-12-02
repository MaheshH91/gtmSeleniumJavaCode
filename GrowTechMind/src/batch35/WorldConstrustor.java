package batch35;

public class WorldConstrustor {

	static void country1() {
		System.out.println("Nepal");
	}

	void country2() {
		System.out.println("USA");
	}

	public WorldConstrustor() {
		System.out.println("India");
	}

	public static void main(String[] args) {
		WorldConstrustor ref = new WorldConstrustor();   //constructor called automatically
		ref.country2();   //non static method calling
		country1(); //static method
		new WorldConstrustor();  // Create Object Using 2nd Method
		
	}

}
