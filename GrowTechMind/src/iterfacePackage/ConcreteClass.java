package iterfacePackage;

interface InterfaceName {
	void method1();

	void method2();

}

abstract class AbstractClass implements InterfaceName {

	abstract void abmethod1();

	abstract void abmethod2();

}

class ConcreteClass extends AbstractClass {
	void ccMethod1() {
		System.out.println("CC method1");
	}

	void ccMethod2() {
		System.out.println("CC method2");
	}

	public static void main(String[] args) {
		ConcreteClass cc = new ConcreteClass();
		cc.ccMethod1();
		cc.ccMethod2();
		cc.abmethod1();
		cc.abmethod2();
		cc.method1();
		cc.method2();
	}

	@Override
	public void method1() {
		System.out.println("Interface method1 Implementation");

	}

	@Override
	public void method2() {
		System.out.println("Interface method2 Implementation");

	}

	@Override
	void abmethod1() {
		System.out.println("abstract class abmethod1 method implementation");
	}

	@Override
	void abmethod2() {
		System.out.println("abstract class abmethod2 method implementation");

	}
}
