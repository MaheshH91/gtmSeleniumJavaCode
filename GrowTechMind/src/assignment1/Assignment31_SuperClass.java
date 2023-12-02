package assignment1;

//Create a superclass with 1 static and 1 non-static method. Create 4 subclasses and add the main method in each. Now using hierarchical level inheritance access the common Super class from each sub-class

public class Assignment31_SuperClass {
	public void notStaticMethod(int a) {
		System.out.println("Super class non static method " + a);
	}

	public static void staticMethod() {
		System.out.println("This is a static method in the Superclass.");
	}
}
