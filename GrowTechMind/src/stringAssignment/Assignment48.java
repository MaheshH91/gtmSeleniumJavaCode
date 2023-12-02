package stringAssignment;

//
//String a= Leela 
//String b = Sai
//Op Lseaeila
public class Assignment48 {
	public static void main(String[] args) {
		String a = "Leela";
		String b = "Sai";
		String result = interleaveStrings(a, b);
		System.out.println(result);
	}

	public static String interleaveStrings(String a, String b) {
		int minLength = Math.min(a.length(), b.length());
		String interleaved = "";

		for (int i = 0; i < minLength; i++) {
			interleaved += a.charAt(i);
			interleaved += b.charAt(i);
		}

		if (a.length() > b.length()) {
			interleaved += a.substring(minLength);
		} else if (b.length() > a.length()) {
			interleaved += b.substring(minLength);
		}

		return interleaved;
	}
}
