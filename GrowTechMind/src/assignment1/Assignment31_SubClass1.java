package assignment1;

//Create a superclass with 1 static and 1 non-static method. Create 4 subclasses and add the main method in each. Now using hierarchical level inheritance access the common Super class from each sub-class
class Assignment31_SubClass1 extends Assignment31_SuperClass {

	public void method() {
		System.out.println("Assignment31_SubClass1 method 1");
	}
	public static void main(String[] args) {
		staticMethod();
		Assignment31_SubClass1 ref = new Assignment31_SubClass1();
		ref.notStaticMethod(31);
	}
}
