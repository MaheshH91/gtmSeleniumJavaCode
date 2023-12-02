package assignment1;
//Assignment34 Achieve multi level inheritance using 1 sub class 1 abstract class 

//and 1 interface as super most class, where abstract class have 2AM,1SM,1NSM & Sub class have 1MM,1SM,1NSM.

interface Interface2 {
	void interfaceMethod();
}

abstract class AbstractClass3 implements Interface2 {
	// 2AM,1SM,1NSM
	abstract void abstractMethod1();

	abstract void abstractMethod2();

	static void staticMethod1() {
		System.out.println("Inside static method1 in class AbstractClass1");
	}

	void nonStaticMethod1() {
		System.out.println("Inside non static method1 in class AbstractClass1");
	}

}

public class Assignment34 extends AbstractClass3 {
//1MM,1SM,1NSM.
	@Override
	public void interfaceMethod() {
		System.out.println("Inside a Interface abstract method implementation in Inside a Class Assignment 34");
	}

	@Override
	void abstractMethod1() {
		System.out.println("Inside a abstract method implementation in Inside a Class Assignment 34");
	}

	@Override
	void abstractMethod2() {
		System.out.println("Inside a abstract method2 implementation in Inside a Class Assignment 34");
	}

	static void staticMethod2() {
		System.out.println("Inside static method2 in Childest class ");
	}

	void nonStaticMethod1() {
		System.out.println("Inside non static method1 in Childest class");
	}

	public static void main(String[] args) {
		Assignment34 ref = new Assignment34();
		ref.abstractMethod1();
		ref.abstractMethod2();
		ref.interfaceMethod();
		ref.nonStaticMethod1();

		staticMethod1();
		staticMethod2();
	}
}