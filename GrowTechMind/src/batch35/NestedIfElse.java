package batch35;

public class NestedIfElse {

	public static void main(String[] args) {
		int age = 21;
		if (age > 18) {

			if (age > 65) {
				System.out.println("Senior Cityzen");
			} else {
				System.out.println("Adult Price");
			}
		} else {
			System.out.println("Half Price");
		}
	}

}
