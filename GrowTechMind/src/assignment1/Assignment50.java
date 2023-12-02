package assignment1;

import java.util.Scanner;

/*
WAP to show the switch case*/
public class Assignment50 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number between 1 to 5");
		int i = sc.nextInt();
		switch (i) {
		case 1:
			System.out.println("You have enter 1");
			break;
		case 2:
			System.out.println("You have enter 2");
			break;
		case 3:
			System.out.println("You have enter 3");
			break;
		case 4:
			System.out.println("You have enter 4");
			break;
		case 5:
			System.out.println("You have enter 5");
			break;
		default:
			System.out.println("The value is not between 1 to 5");
			break;
		}
		sc.close();
	}
}