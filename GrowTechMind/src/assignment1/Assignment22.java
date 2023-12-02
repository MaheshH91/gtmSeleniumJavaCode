package assignment1;

//22. WAP with static global variables and print the updated values

public class Assignment22 {

	static int a = 10;
	static int b = 12;

	public static void main(String[] args) {
		System.out.println("Initial Value");
		System.out.println("Initial Value of a is " + a);
		System.out.println("Initial Value of b is " + b);

		a = a + 1;
		b = b + 1;
		System.out.println("\nUpdated Value");
		System.out.println("Updated Value of a is " + a);
		System.out.println("Updated Value of b is " + b);

	}

}
