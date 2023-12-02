package batch35;

class India {
	void highway() {
		System.out.println("1");
	}

	void railway() {
		System.out.println("2");
	}
}

class MaharashtraState extends India {
	void add() {
		System.out.println("3");
	}
}

public class UpcastingExample {

	public static void main(String[] args) {
		India i1 = new MaharashtraState(); // Upcasting implicit
		// Implecit and Explicit
		India i2 = (India) new MaharashtraState(); // Upcasting Explicitly

		i1.highway();
		i1.railway();
//		i1.add();
		i2.highway();
		i2.railway();

	}
}
