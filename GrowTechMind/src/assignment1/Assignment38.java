package assignment1;

//Write a Java program to Create a child class and a parent class, 
//create a relation between them, and after inheriting make the parent 
//class as final.

final class ParentClass2 {
	public void parentClassMethod() {
		System.out.println("Inside a parent class method");
	}
}

public class Assignment38 extends ParentClass2 {
	public static void main(String[] args) {
		Assignment38 cc = new Assignment38();
		cc.parentClassMethod();

	}
}