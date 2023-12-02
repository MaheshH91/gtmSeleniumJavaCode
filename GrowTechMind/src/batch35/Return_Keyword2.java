package batch35;

public class Return_Keyword2 {
	static double add(double a, double b) {
		double c = a + b;
		return c;
	}

	static int add(int a, int b) {
		int c = a + b;
		return c;
	}
	static double add(int a, double b) {
		double c = a + b;
		return c;
	}
	public static void main(String[] args) {
		System.out.println(add(13,54));
		System.out.println(add(13.23,54.65));
		System.out.println(add(34, 65.678));
		
	}

}
