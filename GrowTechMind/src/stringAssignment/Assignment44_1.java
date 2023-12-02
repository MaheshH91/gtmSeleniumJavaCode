package stringAssignment;
/*Write a java program to print output-            
my
name
is
Ram
from 
input- My name is Ram   
*/

class Assignment44_1 {

	public static void main(String[] args) {
		String str = "My name is Ram";
		String word[] = str.split(" ");
		for (int i = 0; i <= word.length - 1; i++) {
			if(word[i].equals("My")) {
				System.out.println(word[i].toLowerCase());
			}
			else {
				System.out.println(word[i]);
			}
		}

	}
}