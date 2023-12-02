package batch35;

public class MethodOverloadingNonStaticMethod2 {
	void add(boolean a) {

		System.out.println(a);
	}

	void add(int a, int b, String c) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	void add(String a, boolean b, char c, double d) {
		System.out.println("a");
	}

	void add(double a, char b) {
		System.out.println("1");
	}

	public static void main(String[] args) {
		MethodOverloadingNonStaticMethod2 m = new MethodOverloadingNonStaticMethod2();
		m.add(false);
		m.add(7.34, 'M');
		m.add("Mahesh", true, 'H', 7.65);
		m.add(2, 88, "Student Name");
	}
}
