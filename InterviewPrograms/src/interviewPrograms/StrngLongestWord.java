package interviewPrograms;

class StrngLongestWord {

	public static void main(String args[]) {
		String str = "India is my country";

		String[] words = str.split(" ");
		String longestWord = words[0];
		for (String word : words) {
			if (word.length() > longestWord.length()) {
				longestWord = word;
			}
		}
		System.out.println(longestWord);
	}
}