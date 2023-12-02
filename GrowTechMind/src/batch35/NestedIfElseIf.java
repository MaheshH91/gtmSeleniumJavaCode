package batch35;

public class NestedIfElseIf {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;

		if (a != b) {
			if (a > b) {
				if (b == c) {
					System.out.println("1");
				} else {
					System.out.println("2");

				}
			} else {
				System.out.println("3");
			}
		} else {
			System.out.println("4");
		}
	}
}
