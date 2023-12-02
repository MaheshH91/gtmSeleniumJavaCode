package collection_pkg;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSort {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(33);
		a1.add(43);
		a1.add(432);
		a1.add(1);
		a1.add(456);
		System.out.println("before sorting");
		System.out.println(a1);
		Collections.sort(a1);
		System.out.println("After sorting");
		System.out.println(a1);
	}

}
