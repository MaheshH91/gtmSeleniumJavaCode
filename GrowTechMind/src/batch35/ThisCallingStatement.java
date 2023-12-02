package batch35;

public class ThisCallingStatement {

	public ThisCallingStatement() {
		this(13);
		System.out.println("This Calling Statement default");
	}
	public ThisCallingStatement(int a) {
		this("Mahesh");
		System.out.println("This Calling Statement pARA CONSTRUCTOR "+a);
	}
	public ThisCallingStatement(String str) {
		System.out.println("This calling statement para construcctor "+str);
	}
	public static void main(String[] args) {
		new ThisCallingStatement();
	}
}
