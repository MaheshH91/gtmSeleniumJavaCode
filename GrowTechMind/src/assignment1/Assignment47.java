package assignment1;

import java.util.Scanner;

/*
Check if age of a person is more than or equal to 18.
 If yes visit  a website google.com. if not throw arithmetic exception
*/
public class Assignment47 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");

		int age = sc.nextInt();

		if (age > 18) {
			System.out.println("Yes visit a website google.com");
		} else {
			throw new ArithmeticException("Your age is not greater than 18");

		}
	}
}