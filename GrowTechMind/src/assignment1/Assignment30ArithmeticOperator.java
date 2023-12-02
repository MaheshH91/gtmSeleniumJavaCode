package assignment1;

//WAP for Multi level inheritance by creating 5 classes. 
//1 sub-class named arithmetic operator and 4 different classes with
//4 non-static methods add,sub,multiplication, division.
//Call all the 4 methods inside the sub-class.
import java.util.Scanner;

class Add {
	public void addition(int a, int b) {
		int result = a + b;
		System.out.println("Addition:       " + a + " + " + b + " = " + result);
	}
}

class Mul extends Add {
	public void multiplication(int a, int b) {
		int result = a * b;
		System.out.println("Multiplication: " + a + " * " + b + " = " + result);
	}
}

class Sub extends Mul {
	public void subtraction(int a, int b) {
		int result = a - b;
		System.out.println("Subtraction:    " + a + " - " + b + " = " + result);
	}
}

class Div extends Sub {
	public void division(int a, int b) {
		if (b != 0) {
			double result = (double) a / b;
			System.out.println("Division:       " + a + " / " + b + " = " + result);
		} else {
			System.out.println("Division by zero is not allowed.");
		}
	}
}

public class Assignment30ArithmeticOperator extends Div {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number");
		int b = sc.nextInt();

		Assignment30ArithmeticOperator ref = new Assignment30ArithmeticOperator();
		ref.addition(a, b);
		ref.multiplication(a, b);
		ref.subtraction(a, b);
		ref.division(a, b);
		sc.close();
	}
}
