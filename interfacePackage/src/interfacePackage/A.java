package interfacePackage;

public interface A {
	void display();

	default void show() {
		
		System.out.println("I am from Interface A default method");
	}

	public  static void print() {
		System.out.println("I am from Interface A static method");
		A.privateMethod();
	}
	private static  void privateMethod() {
		System.out.println("I am from Interface A Private method");
	}
}
