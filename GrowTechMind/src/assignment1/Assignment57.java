//class type upcasting case 5 
package assignment1;

class Greatest_Parent {
	void a1() {
		System.out.println("Greatest Parent");
	}
}

class Intermediate_Parent extends Greatest_Parent {
	void b1() {
		System.out.println("Intermediate Parent");
	}
}

class Parent10 extends Intermediate_Parent {
	void c1() {
		System.out.println("Childest Parent");
	}
}

public class Assignment57 extends Parent10 {
	void d1() {
		System.out.println("Parent");
	}

	public static void main(String[] args) {
		Greatest_Parent g1 = new Parent10();
		Parent10 p1 = (Parent10) g1;
		p1.a1();
		p1.b1();
		p1.c1();
	}

}