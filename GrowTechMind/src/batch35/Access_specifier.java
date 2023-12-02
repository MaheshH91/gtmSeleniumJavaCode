package batch35;

public class Access_specifier {
	public void add() {
		System.out.println("1");
	}

	private void Sub() {
		System.out.println("2");
	}

	void div() {
		System.out.println("4");
	}

	protected void mul() {
		System.out.println("3");
	}

	public static void main(String[] args) {
		Access_specifier as = new Access_specifier();
		as.add();
		as.Sub();
		as.mul();
		as.div();

	}

}
