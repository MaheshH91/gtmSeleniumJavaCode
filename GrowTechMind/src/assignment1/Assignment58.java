package assignment1;

/*
Class type class casting Assignment*/
class Animal4 {
	String name = "Animal";

	void method1() {
		System.out.println("I am method1 from Animal class");
	}
}

class Mamal4 extends Animal4 {
	String name1 = "Mamals";

	void method2() {
		System.out.println("I am method2 from Mamal class");
	}
}

class Cat4 extends Mamal4 {
	String name2 = "Cats";

	void method3() {
		System.out.println("I am method3 from cat class");
	}
}
class Kitten4 extends Cat4 {
	String name4 = "Kiitens";

	void method4() {
		System.out.println("I am method4 from Kiitens class");
	}
}
public class Assignment58 {

	public static void main(String[] args) {
		Animal4 a1 = new Cat4();
		Cat4 m1 =  (Cat4) a1;
		m1.method1();
		m1.method2();
	
		m1.method3();
//		m1.method4();
		System.out.println(m1.name);
		System.out.println(m1.name1);
		System.out.println(m1.name2);
//		System.out.println(m1.name4);
	}

}