package assignmentExamples;

import java.util.Scanner;

public class throwAssingment {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter Age");
	int age =sc.nextInt();
    
		if(age>=18) {
			System.out.println("You can visit Google.com");
		}
		else {
			throw new ArithmeticException("Age is not greater than 18.");
	}
}
}
