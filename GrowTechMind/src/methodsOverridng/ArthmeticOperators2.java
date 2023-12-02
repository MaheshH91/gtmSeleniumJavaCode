package methodsOverridng;

class Addition1 {
	void add() {
		System.out.println("Super Class");
	}

}

public class ArthmeticOperators2 extends Addition1 {

	void add() {

		System.out.println("Sub Class");
//		super.add();
	}

	public static void main(String[] args) {
		ArthmeticOperators2 a = new ArthmeticOperators2();
		a.add();

	}

}
