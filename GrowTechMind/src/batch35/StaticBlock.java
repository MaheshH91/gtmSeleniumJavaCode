package batch35;

public class StaticBlock {
	static {    //SIB
		System.out.println("I am SIB");
	}

	public static void main(String[] args) {
		new StaticBlock();
		System.out.println("I am Main method");
	}
}
