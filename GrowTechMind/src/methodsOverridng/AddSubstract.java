package methodsOverridng;

abstract class Arithmetic3 { // Out side world code
	abstract void add();

	abstract void sustract();
}

public class AddSubstract extends Arithmetic3 { // inside the company

	public static void main(String[] args) {
		AddSubstract a1 = new AddSubstract();
		a1.add();
		a1.sustract();
	}

	void add() {
		System.out.println("addition using scanner class");
	}

	void sustract() {
		System.out.println("substraction using scanner class");
	}
}
