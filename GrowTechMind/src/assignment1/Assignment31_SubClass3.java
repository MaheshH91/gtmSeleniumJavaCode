package assignment1;

public class Assignment31_SubClass3 extends Assignment31_SuperClass {
	public void method() {
		System.out.println("Assignment31_SubClass3 method 1");
	}
	public static void main(String[] args) {
		staticMethod();
		Assignment31_SuperClass ref = new Assignment31_SuperClass();
		ref.notStaticMethod(51);
	}
}
