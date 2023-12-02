package interviewPrograms;

class StringReverse {

	public static void main(String args[]) {

		String str = "India";

		int stringLength = str.length();
		String reverse = "";
		for (int i = stringLength - 1; i >= 0; i--) {

			reverse = reverse + str.charAt(i);
		}
		System.out.println(reverse);
	}
}