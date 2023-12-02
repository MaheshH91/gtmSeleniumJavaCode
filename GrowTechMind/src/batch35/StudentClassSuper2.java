package batch35;

class Mentor2 {
	Mentor2(int a) {
		System.out.println("mentor2 constructor");
	}
}

public class StudentClassSuper2 extends Mentor2 {

	StudentClassSuper2() {
		super(100);
		System.out.println("Student Constructor2");

	}

	public static void main(String[] args) {

		new StudentClassSuper2();

	}

}
