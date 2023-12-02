package assignment1;

//Assignment25 WAP to create 5 SIB and check the order of execution
public class Assignment25 {
	static {
		System.out.println("I am in 1st SIB.");
	}
	static {
		System.out.println("I am in 2nd SIB.");
	}
	static {
		System.out.println("I am in 3rd SIB.");
	}
	static {
		System.out.println("I am in 4th SIB.");
	}
	static {
		System.out.println("I am in 5th SIB.");
	}

    public static void main(String[] args) {
       System.out.println("I am in Main methods");
    }
}

