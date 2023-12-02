package assignment1;

/*
Class type casting case 3*/
class Animal2 {
	String name = "Animal";

	void method1() {
		System.out.println("I am in method1 from Animal class");
	}
}

class Mamal2 extends Animal2 {
	String name1 = "Mamals";

	void method2() {
		System.out.println("I am in method2 from Mamal class");
	}
}

class Cat2 extends Mamal2 {
	String name2 = "Cats";

	void method3() {
		System.out.println("I am in method3 from cat class");
	}
}

public class Assignment55 {

	public static void main(String[] args) {
		Animal2 a1 = new Cat2();
		Cat2 m1 = (Cat2) a1;
		m1.method1();
		m1.method2();
		m1.method3();
		System.out.println(m1.name);
		System.out.println(m1.name1);
		System.out.println(m1.name2);

	}

}