package assignment1;

public class StringAssing {
public static void main(String[] args) {
	String a = "My Name is Mahesh";
	int lengthOfString = a.length();
	System.out.println(lengthOfString);
	String a4 = a.substring(11);
	System.out.println(a4);
	
	String a3 = a.substring(8,10);
	System.out.println(a3);
	String a2 = a.substring(3,7);
	System.out.println(a2);
	String a1 = a.substring(0,2);
	System.out.println(a1);
	
	System.out.println(a4.concat(" ").concat(a3).concat(" ").concat(a2).concat(" ").concat(a1));
}
}
