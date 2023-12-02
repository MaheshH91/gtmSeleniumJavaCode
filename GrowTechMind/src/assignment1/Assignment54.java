package assignment1;

/*
Class type casting case 2*/
class Animal1 {
	String name = "Animal";

	void method1() {
		System.out.println("I am method1 from Animal class");
	}
}
class Mamal extends Animal1 {
	String name1 = "Mamals";
	void method2() {
		System.out.println("I am method2 from Mamal class");
	}
}
class Cat extends Mamal {
	String name2 = "Cats";
	void method3() {
		System.out.println("I am in methods3 from cat class");
	}
}
public class Assignment54 {
	public static void main(String[] args) {
		Mamal m1 = new Cat();
		Cat c1 = (Cat) m1;
		c1.method1();
		c1.method2();
		c1.method3();
		System.out.println(c1.name);
		System.out.println(c1.name1);
		System.out.println(c1.name2);
	}

}