package batch35;

import java.util.Scanner;

public class AdditionUsingHumanInout {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number ");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();

		int result = number1 + number2;
		System.out.println(result);
		new AdditionUsingHumanInout();
		sc.close();
	}

}
