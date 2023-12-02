package batch35;

public class LogicalOperators2 {

	public static void main(String[] args) {

		int age = 10;
		int salary = 1000;

		if (age > 18 || salary > 2000) {
			System.out.println("Student 1");
		} else {
			System.out.println("Student 2");
		}

		if (!(age > 18 || salary > 2000)) {
			System.out.println("Student 3");
		} else {
			System.out.println("Student 4");
		}

		if (age > 25 && salary > 2000) {
			System.out.println("Student 5");
		} else {
			System.out.println("Student 6");
		}
		if (!(age > 18 && salary > 2000)) {
			System.out.println("Student 7");
		} else {
			System.out.println("Student 8");
		}
	}

}
