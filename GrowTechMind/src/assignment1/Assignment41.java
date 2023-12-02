package assignment1;

//Write a program java for Using super calling statement call parent class' 
//constructor from child class' constructor implicit way.
class SuperClasssss {

	public SuperClasssss() {
		System.out.println("Inside a super class Constructor");
	}
}

class Assignment41 extends SuperClasssss {
	public Assignment41() {
		super();
		System.out.println("Inside the Assignment41 constructor");
	}
	public static void main(String[] args) {
		 new Assignment41();
	}
}