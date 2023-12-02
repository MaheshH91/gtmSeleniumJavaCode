package assignment1;
//Assignment//Write a Java program  to achieve multiple level inheritance

class GrandParentClass {
	public void car() {
		System.out.println("Inside Car method in grand parent class");
	}
}
class ParentClass extends GrandParentClass {
	public void bike() {
		System.out.println("Inside Bike method in parent class");
	}
}
class Assignment35 extends ParentClass {
	public void cycle() {
		System.out.println("Inside Cycle method in Assignment35 class");
	}
	public static void main(String[] args) {
		Assignment35 cc = new Assignment35();
		cc.bike();
		cc.car();
		cc.cycle();
	}
}
