package batch35;

public class String_Functions {
	public static void main(String[] args) {
		String str = "India";
		String str1 = "My World";
		String str2 = "Asia Continent";
		String str3 = "   Mahesh ";

		// Get the length of the string
		System.out.println(str.length()); // Output: 5

		// Get the character at a specific index (indexing starts at 0)
		System.out.println(str.charAt(1)); // Output: n

		// Find the index of a specific character in the string
		System.out.println(str.indexOf('i')); // Output: 1

		// Convert the string to uppercase
		System.out.println(str.toUpperCase()); // Output: INDIA

		// Convert the string to lowercase
		System.out.println(str1.toLowerCase()); // Output: my world

		// Concatenate strings
		System.out.println(str1.concat(str)); // Output: My WorldIndia
		System.out.println(str1.concat("  ").concat(str)); // Output: My World India

		// Get a substring from the original string
		System.out.println(str1.substring(3, 8)); // Output: World

		// Get a substring starting from a specific index
		System.out.println(str2.substring(5)); // Output: Continent

		// Print the original string with leading and trailing spaces
		System.out.println(str3); // Output: Mahesh

		// Remove leading and trailing spaces (trim)
		System.out.println(str3.trim()); // Output: Mahesh
	}
}
