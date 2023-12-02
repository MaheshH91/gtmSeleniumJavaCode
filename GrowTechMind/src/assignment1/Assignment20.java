package assignment1;

//non static method overloading

public class Assignment20 {
	public int add(int a, int b) {
		return a + b;
	}

	public double add(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {
		Assignment20 a20 = new Assignment20();
		int sum = a20.add(7, 13);
		double sum2 = a20.add(12.2, 13.3);
		System.out.println("addtion of Integere is " + sum);
		System.out.println("addtion of double is " + sum2);
	}

}
