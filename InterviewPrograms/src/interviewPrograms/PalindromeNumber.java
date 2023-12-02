/**
 * 
 */
package interviewPrograms;

/**
 * 
 */


/**
 * 
 */
public class PalindromeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int originalNumber = 151;
		int number = originalNumber; // Store the original number for comparison
		int reverse = 0;
		int reminder;
		
		while (number > 0) {
			reminder = number % 10;
			reverse = reverse * 10 + reminder;
			number = number / 10;
		}
		
		System.out.println(reverse);
		
		if (reverse == originalNumber) {
			System.out.println("The number is palindrome");
		} else {
			System.out.println("The number is not palindrome");
		}
	}
}
