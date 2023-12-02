package assignment1;

/*
Class type casting case 1*/
class Animal {
	void method1() {
		System.out.println("I am method1 from Animal class");
	}
}

class Dog extends Animal {
	void method2() {
		System.out.println("I am method2 from Dog class");
	}
}

public class Assignment53 {

	public static void main(String[] args) {
		Animal p1 = new Dog();
		p1.method1();// method1 is accessible in upcasting
//		p1.method2();// method2 is not accessible in upcasting

	}

}