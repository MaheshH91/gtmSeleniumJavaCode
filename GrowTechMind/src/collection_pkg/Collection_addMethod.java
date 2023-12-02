package collection_pkg;

import java.util.ArrayList;

public class Collection_addMethod {

	public static void main(String[] args) {

		ArrayList a1 = new ArrayList();
		a1.add(76);
		a1.add(76.65);
		a1.add('C');
		a1.add("Mahesh");
		a1.add(null);
		a1.add(true);

		System.out.println(a1);
		ArrayList a2= new ArrayList();
		a2.add("Ram Tiwari");
		a2.add(9876543211l);
		a2.add('M');
		a2.add("flat no d2, a block banglore 560001");
		a2.add("pincode 560001");
		
		System.out.println(a2);
	}

}
