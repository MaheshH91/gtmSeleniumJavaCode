package methodsOverridng;

class Addition {
	void add() {
		System.out.println("Addition of 3 number");
	}
}
public class ArthmeticOperators extends Addition {

	void add() {
		super.add();
		System.out.println("addtion  of 2 number");
	}
	public static void main(String[] args) {
		ArthmeticOperators a = new ArthmeticOperators();
		a.add();
		
	}

}
