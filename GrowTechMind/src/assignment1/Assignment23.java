package assignment1;

//23 Write a program for different java Logical operator

public class Assignment23 {

	public static void main(String[] args) {
		int a = 20;
		int b = 40;
		int c = 60;

		// logical And operator
		if (a < b && b > a) {
			System.out.println("Percentage");
		}

		//logical or operator
		if (b > a || a > b) {
			System.out.println("Address");
		}

		//logical Not operator
		if (!(a > c && b < c)) {
			System.out.println("City");
		}

	}

}
