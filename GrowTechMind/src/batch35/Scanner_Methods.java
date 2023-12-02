package batch35;

import java.util.Scanner;

public class Scanner_Methods {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Create a Scanner object to read from standard input

		String name = sc.next(); // Read a string
		int age = sc.nextInt(); // Read an integer
		int age1 = sc.nextByte(); // Read a byte (not recommended for reading age)

		short age2 = sc.nextShort(); // Read a short
		long age3 = sc.nextLong(); // Read a long
		float f1 = sc.nextFloat(); // Read a float
		double d2 = sc.nextDouble(); // Read a double
		boolean b1 = sc.nextBoolean(); // Read a boolean

		// Print the values
		System.out.println(name);
		System.out.println(age);
		System.out.println(age1);
		System.out.println(age2);
		System.out.println(age3);
		System.out.println(f1);
		System.out.println(d2);
		System.out.println(b1);

		sc.close(); // Close the Scanner object
	}
}