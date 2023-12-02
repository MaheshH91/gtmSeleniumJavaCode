package batch35;

public class LogicalOperators {

	public static void main(String[] args) {

		int age = 10;
		int salary = 1000;

		if (age > 18 || salary > 2000) {
			System.out.println("Student 1");
		}

		if (!(age > 25 || salary > 2000)) {
			System.out.println("Student 2");
		}

		if (age > 5 && salary > 2000) {
			System.out.println("Student 3");
		}

		if (!(age > 18 && salary > 2000)) {
			System.out.println("Student 4");
		}

	}

}
