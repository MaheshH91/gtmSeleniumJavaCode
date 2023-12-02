package batch35;

public class MethodOverloading {

	static void add() {
		int a = 6;
		int b = a + 12;
		System.out.println(b);
	}

	static void add(int a) {
		int b = a + 10;
		System.out.println(b);
	}

	void add(double a) {
		double b = a + 10;
		System.out.println(b);
	}

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.add(1.2);
		add(2);
		add();
	}
}
