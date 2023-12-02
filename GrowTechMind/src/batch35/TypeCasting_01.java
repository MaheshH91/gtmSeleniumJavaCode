package batch35;

public class TypeCasting_01 {
	public static void main(String[] args) {
		int weight = 85;
		System.out.println(weight);

		// Casting from int to double (implicit casting)
		int person = 60;
		double weight1 = person; // This is implicit type casting casting (int to double)
		System.out.println(weight1);
		double weight2 = (double) person; // This is Explicit type casting (int to double)
		System.out.println(weight2);
	}
}
