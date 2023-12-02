package assignmentExamples;

class Super {
	  public void method() {
	    System.out.println("Super.method()");
	  }
	}

	class Sub extends Super {
	  // Overriding the method
	  @Override
	  public void method() {
	    System.out.println("Sub.method()");
	  }

	  // Using the super keyword to stop the Super class method from getting overridden
	  public void callSuperMethod() {
	    super.method();
	  }
	}

	public class Main {
	  public static void main(String[] args) {
	    Sub sub = new Sub();
	    sub.method(); // Prints "Sub.method()"
	    sub.callSuperMethod(); // Prints "Super.method()"
	  }
	}