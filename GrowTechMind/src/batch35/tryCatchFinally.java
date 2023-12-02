package batch35;

public class tryCatchFinally {
public static void main(String[] args) {
	try {
		int c= 2147483647/0;
		System.out.println(c);
	} catch (ArithmeticException a) {
		System.out.println("catch block");
	}
	finally {
		System.out.println("Finally Block");
	}
}
}
