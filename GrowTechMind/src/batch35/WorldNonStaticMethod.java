package batch35;

public class WorldNonStaticMethod {

	static void country1() {
		System.out.println("South Africa");
	}

	void country2() {
		System.out.println("Denmark");
	}

	void country3() {
		System.out.println("West Indies");
	}

	public static void main(String[] args) {

		country1(); // Static method calling
		WorldNonStaticMethod w1 = new WorldNonStaticMethod();
		w1.country2(); // Non static method calling
		w1.country3(); // Non static method calling

	}

}
