package assignment1;//WAP to achieve multiple level inheritance
interface I1 {
	void display();
}
interface I2 {
	void displayI2();
}
class Demo12 {
	public void show() {
		System.out.println("Inside a Demo12 class show method");
	}
}
public class Assignment36 extends Demo12 implements I1, I2 {
	@Override
	public void display() {
		System.out.println("Inside a Display method implementation in class assignment36 ");
	}
	@Override
	public void displayI2() {
		System.out.println("Inside a DisplayI2 method implementation in class assignment36 ");
	}
	public static void main(String[] args) {
		Assignment36 as = new Assignment36();
		as.display();
		as.displayI2();
		as.show();
	}
}