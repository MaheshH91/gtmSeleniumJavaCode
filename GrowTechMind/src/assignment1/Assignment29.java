package assignment1;

import java.util.Scanner;
//AssignmentWAP for Arithmatic operators using scanner class
public class Assignment29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number");
		int b = sc.nextInt();

		Assignment29 ref = new Assignment29();
		ref.add(a, b);
		ref.div(a, b);
		ref.mul(a, b);
		ref.sub(a, b);
		sc.close();
	}

	public void div(double a, double b) {
		double c = a / b;
		System.out.println("The division of a and b is = " + c);
	}

	public void mul(int a, int b) {
		int c = a * b;
		System.out.println("The multiplication of a and b is = " + c);
	}

	public void add(int i, int j) {
		int c = i + j;
		System.out.println("The addtion of a and b is = " + c);
	}

	public void sub(int i, int j) {
		int c = i - j;
		System.out.println("The Substraction of a and b is = " + c);
	}
}
