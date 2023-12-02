package batch35;

public class SIbIIbConstructorMain {

	SIbIIbConstructorMain() {
		System.out.println("I am in constructor");
	}

	static {
		System.out.println("I am in SIB");
	}
	{
		System.out.println("I am in IIB");
	}

	public static void main(String[] args) {
//		new SIbIIbConstructorMain();
		System.out.println("I am in main method");
		new SIbIIbConstructorMain();
	}

}
