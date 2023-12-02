package batch35;

public class ArithmeticMethodOverloading {
	static void add() {

		int a = 12;
		int b = a + 5;
		System.out.println(b);
	}

	static void add(int a) {
		int b = a + 3;
		System.out.println(b);
	}

	static void add(double a) {
		double b = a + 2.5;
		System.out.println(b);
	}

	public static void main(String[] args) {
		add();
		add(13);
		add(6.4);
	}
}
