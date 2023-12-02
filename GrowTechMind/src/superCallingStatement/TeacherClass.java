package superCallingStatement;



//Write a program java for Using super calling statement call parent class' constructor from child class' constructor implicit way.
class SuperClassss {

	public SuperClassss() {
		System.out.println("Inside a super class method");
	}

}

class TeacherClass extends SuperClassss {

	public TeacherClass() {
		System.out.println("Inside the Assignment40 constructor");
	}
	public static void main(String[] args) {
		 new TeacherClass();
	}
}