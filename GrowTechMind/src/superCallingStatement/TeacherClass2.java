package superCallingStatement;



//Write a program java for Using super calling statement call parent class' constructor from child class' constructor implicit way.
class SuperClasssss {

	public SuperClasssss() {
		System.out.println("Inside a super class method");
	}

}

class TeacherClass2 extends SuperClasssss {

	public TeacherClass2() {
		super();
		System.out.println("Inside the Assignment40 constructor");
	}
	public static void main(String[] args) {
		 new TeacherClass2();
	}
}