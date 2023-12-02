package interviewPrograms;

public class LargestWordInString {

	public static void main(String[] args) {
		String s = "India is my Country";
		String sb[] = s.split(" ");
		String smallestWord = sb[0];
		String largestWord = sb[0];
		for (String words : sb) {
			if (words.length() < smallestWord.length()) {
				smallestWord = words;
			}
			if (words.length() > largestWord.length()) {
				largestWord = words;
			}

		}
		System.out.println(smallestWord);
		System.out.println(largestWord);
	}
	

}
