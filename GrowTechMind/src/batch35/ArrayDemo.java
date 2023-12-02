package batch35;

public class ArrayDemo {

	public static void main(String[] args) {

		String names[] = new String[3];
		names[0] = "Ram";
		names[1] = "Sita";
		names[2] = "Vishnu";
//		System.out.println(names[0]);
//		System.out.println(names[1]);
//		System.out.println(names[2]);
		for (int i = 0; i <= 2; i++) {
			System.out.println(names[i]);
		}
		int age[] = new int[3];
		age[0] = 51;
		age[1] = 43;
		age[2] = 52;
		for (int i = 0; i <= 2; i++) {
			System.out.println(age[i]);
		}
	}
}
