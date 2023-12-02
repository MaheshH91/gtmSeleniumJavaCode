package assignment1;

//Write a Java program and make use of the super keyword to stop the 
//Super class method from getting overridden.
class Superclass {
	final void finalMethod() {
		System.out.println("This is a final method in the superclass.");
	}
	void finalMethod1() {
		System.out.println("This is a final method 1 in the superclass.");
	}
}
class Assignment37 extends Superclass {
	void finalMethod1() {
		super.finalMethod();
		System.out.println("This is an attempt to override the final method.");
	}
	public static void main(String[] args) {
		Assignment37 subClass = new Assignment37();
		subClass.finalMethod();
	}
}
