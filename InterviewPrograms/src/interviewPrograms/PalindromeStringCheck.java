package interviewPrograms;

public class PalindromeStringCheck {

	public static void main(String[] args) {

		String m = "teet";
		String sb = "";
		
		for(int i = 0; i < m.length();i++) {
			sb = m.charAt(i)+sb;
			
		}
		if(sb.equals(m)) {
			System.out.println(" The Given String is Palindrome");
		}
		else {
			System.out.println("Given String is not palindrome");
		}
		System.out.println(sb);
	}

}
