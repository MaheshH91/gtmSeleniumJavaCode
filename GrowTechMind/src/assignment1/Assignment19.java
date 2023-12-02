package assignment1;

//static method overloading

public class Assignment19 {
	public static int add(int a, int b) {
		return a + b;
	}

	public static double add(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {
		int sum = add(12, 13);
		double sum2 = add(12.2, 13.3);
		System.out.println("Sum of Integer is " + sum);
		System.out.println("Sum of double is " + sum2);
	}

}
