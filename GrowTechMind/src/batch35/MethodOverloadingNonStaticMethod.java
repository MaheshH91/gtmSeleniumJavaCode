package batch35;

public class MethodOverloadingNonStaticMethod {
	static void add() {
		int a = 12;
		int b = a + 21;
		System.out.println(b);
	}

	void add(int a) {
		int b = a + 21;
		System.out.println(b);
	}

	void add(double a) {
		double b = a + 21;
		System.out.println(b);
	}

	public static void main(String[] args) {
		add();
		MethodOverloadingNonStaticMethod m = new MethodOverloadingNonStaticMethod();
		m.add(7.656);
		m.add(2);

	}

}
