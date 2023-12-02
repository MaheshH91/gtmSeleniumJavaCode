package assignment1;
//Assignment26 create a class,2 constructor,2 SIB,2 IIB and check the order of execution
public class Assignment26 {
	static {
		System.out.println("I am in 1st SIB.");
	}
	static {
		System.out.println("I am in 2nd SIB.");
	}
	{
		System.out.println("I am in 1st IIB.");
	}
	{
		System.out.println("I am in 2nd IIB.");
	}
	Assignment26(){
		System.out.println("I am in 1st constructor");
	}
	Assignment26(int a){
		System.out.println("I am in 2nd constructor");
	}
    public static void main(String[] args) {
    	new Assignment26();
    	new Assignment26(23);
       System.out.println("I am in Main methods");
    }
}

