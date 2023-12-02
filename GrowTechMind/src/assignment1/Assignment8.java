package assignment1;

import java.util.Scanner;

//Create different if else if conditions
public class Assignment8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 5");
		int number = sc.nextInt();
//		int number = 4;

		if (number == 1) {
			System.out.println("The number is 1");
		} else if (number == 2) {
			System.out.println("The number is 2");
		} else if (number == 3) {
			System.out.println("The number is 3");
		} else if (number == 4) {
			System.out.println("The number is 4");
		} else if (number == 5) {
			System.out.println("The number is 5");
		} else {
			System.out.println("The number is not between 1 and 5");
		}
		sc.close();
	}

}
