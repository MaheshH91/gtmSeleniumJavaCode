package batch35;

abstract class Arithmatic122 {

	abstract void add();

	abstract void subtract();

}

public class AddSubtract extends Arithmatic122 {

	public static void main(String[] args) {

		AddSubtract a1 = new AddSubtract();
		// Arithmatic a1 = new Arithmatic();
		a1.add();
		a1.subtract();
	}

	@Override
	void add() {
		System.out.println("addition using scanner class");
	}

	@Override
	void subtract() {
		System.out.println("Subtraction using scanner class");
	}

}