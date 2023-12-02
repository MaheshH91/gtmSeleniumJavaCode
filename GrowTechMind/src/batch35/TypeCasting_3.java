package batch35;

// 
public class TypeCasting_3 {

	public static void main(String[] args) {
		long c = 32523423;
		long d = c %  32768;
		System.out.println(d);
		short a = (short) c;
		System.out.println(a);
		long b = (long) a;
		System.out.println(b);
		//
		/*
		 * I apologize for my previous response. I was mistaken about the output of your
		 * code.
		 * 
		 * The correct output of your code is 17567.
		 * 
		 * I reviewed my knowledge of type casting and realized that I made a mistake in
		 * calculating the truncated value of the long variable c. The long variable c
		 * has a value of 32523423, which is outside of the range of the short data
		 * type. Therefore, the data will be truncated, and the value of the short
		 * variable a will be the remainder of 32523423 divided by 32768.
		 * 
		 * The remainder of 32523423 divided by 32768 is 17567. Therefore, the value of
		 * the short variable a will be 17567.
		 */
	}
}
