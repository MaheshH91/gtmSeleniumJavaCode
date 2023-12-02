package stringAssignment;


class Assignment44 {

	public static void main(String[] args) {
		String str = "My name is Ram" ;
		String word[]= str.split(" ");
		for(int i=word.length-1; i>=0;i--) {
			System.out.print(word[i]+" ");
		}
		
	}
}