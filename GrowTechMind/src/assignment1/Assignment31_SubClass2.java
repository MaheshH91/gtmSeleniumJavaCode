package assignment1;

public class Assignment31_SubClass2 extends Assignment31_SuperClass {
	public void method() {
		System.out.println("Assignment31_SubClass2 method 1");
	}
	public static void main(String[] args) {
		staticMethod();
		Assignment31_SubClass2 ref = new Assignment31_SubClass2();
		ref.notStaticMethod(41);
	}
}
