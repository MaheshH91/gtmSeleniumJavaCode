package interviewPrograms;

public class GlobalVariable {

	int a = 10;
	static int b = 20;

	void man() {

		final double pi = 3.14;
		System.out.println(pi);
	}

	public static void main(String[] args) {
		System.out.println(b);
		GlobalVariable g1 = new GlobalVariable();
		System.out.println(g1.a);
		g1.man();
	}
}
