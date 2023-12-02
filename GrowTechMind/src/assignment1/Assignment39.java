package assignment1;

//Write a program for method overriding and using final key word stop Super-class methods from getting overridden by sub class.
class SuperClasss{
	final public void demoMethod() {
		System.out.println("Inside a super class demoMethod method");
	}
}
class Assignment39 extends SuperClasss{
	public void demoMethod() {
		System.out.println("Inside a Sub class demoMethod method");
	}
	public static void main(String[] args) {
		Assignment39 ref = new Assignment39();
		ref.demoMethod();
	}
}