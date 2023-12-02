package assignment1;
//Write A java  Program using multi-level inheritance where 1 child inherits 1 abstract class & that 
//abstract class inherits another abstract class, both having 2 Abstract Methods,1StaticMethod, 1Non Static Method.
//Abstract class A

abstract class AbstractClass1 {
	abstract void abstractMethod1();
	abstract void abstractMethod2();

	static void staticMethod1() {
		System.out.println("Inside static method1 in class AbstractClass1");
	}
	void nonStaticMethod1() {
		System.out.println("Inside non static method1 in class AbstractClass1");
	}
}

abstract class AbstractClass2 extends  AbstractClass1{
	abstract void abstractMethod3();
	abstract void abstractMethod4();
	static void staticMethod2() {
		System.out.println("Inside static method1 in class AbstractClass2");
	}
	void nonStaticMethod2() {
		System.out.println("Inside non static method1 in class AbstractClass2");
	}
}
public class Assignment32  extends  AbstractClass2{
	@Override
	void abstractMethod3() {
		System.out.println("Concrete implementation of abstractMethod3 in class AssignmentClass");
	}
	@Override
	void abstractMethod4() {
		System.out.println("Concrete implementation of abstractMethod4 in class AssignmentClass");
	}
	@Override
	void abstractMethod1() {
		System.out.println("Concrete implementation of abstractMethod1 in class AssignmentClass");
	}
	@Override
	void abstractMethod2() {
		System.out.println("Concrete implementation of abstractMethod2 in class AssignmentClass");
	}
	public static void main(String[] args) {
		Assignment32 ref = new Assignment32();
		ref.abstractMethod1();
		ref.abstractMethod2();
		ref.abstractMethod3();
		ref.abstractMethod4();
		
		ref.nonStaticMethod1();
		ref.nonStaticMethod2();
		
		staticMethod1();
		staticMethod2();
		

		
	}
}