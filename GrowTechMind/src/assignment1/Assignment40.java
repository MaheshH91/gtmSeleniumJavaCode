package assignment1;

//Write a program java for Using super calling statement call parent 
//class' constructor from child class' constructor implicit way.
class SuperClassss {
	public SuperClassss() {
		System.out.println("Inside a super class method");
	}
}

class Assignment40 extends SuperClassss {
	public Assignment40() {
		System.out.println("Inside the Assignment40 constructor");
	}
	public static void main(String[] args) {
		Assignment40 ref = new Assignment40();
	}
}