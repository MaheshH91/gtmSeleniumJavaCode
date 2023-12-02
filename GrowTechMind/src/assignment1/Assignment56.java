package assignment1;

/*
Class type casting case 4*/
class Animal3 {
	String name = "Animal";

	void method1() {
		System.out.println("I am method1 from Animal class");
	}
}

class Mamal3 extends Animal3 {
	String name1 = "Mamals";

	void method2() {
		System.out.println("I am method2 from Mamal class");
	}
}

class Cat3 extends Mamal3 {
	String name2 = "Cats";

	void method3() {
		System.out.println("I am in methods3 from cat class");
	}
}

public class Assignment56 {

	public static void main(String[] args) {
		Animal3 a1 = new Mamal3();
		Mamal3 m1 =  (Mamal3) a1;
		m1.method1();
		m1.method2();
//		m1.method3();
		System.out.println(m1.name);
		System.out.println(m1.name1);
//		System.out.println(m1.name2);

	}

}