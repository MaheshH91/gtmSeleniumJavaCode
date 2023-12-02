package assignment1;
//WAP using interface and achieve single level inheritance with 1 sub class and 1 interface.

interface Interface1{
	abstract void abstractMethods();
}
public class Assignment33  implements Interface1{
	@Override
	public void abstractMethods() {
		System.out.println("Inside implementation of abstract method1 in Interface1");
	}
public static void main(String[] args) {
	Assignment33 ref= new Assignment33();
	ref.abstractMethods();
}
}