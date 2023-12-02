package assignment1;

//Assignment21 . java constructor overloading

public class Assignment21 {
	
	public Assignment21(int a) {
		System.out.println("This is para constructor " + a);
	}

	public Assignment21(String a) {
		System.out.println("This is string para constructor " + a);
	}

	public Assignment21() {
		System.out.println("This is default constructor");
	}

	public static void main(String[] args) {
		new Assignment21();
		new Assignment21(21);
		new Assignment21("Assignment");

	}

}
