package batch35;

public class MethodOverloadingStaticMethod {

	public static void add() {
		int a = 10;
		int b = 2;
		int addition = a + b;
		System.out.println("This is Non Parameterized method result : " + addition);

	}

	public static void add(int a, int b) {
		int addition = a + b;
		System.out.println("This is parameterized method result : " + addition);
	}

	public static void main(String[] args) {
		add();
		add(10, 20);

	}

}
