package assignment1;
/*
input- My name is Ram
output-
m
y
n
a
m
e
i
s
r
a
m
*/
class Assignment45 {

	public static void main(String[] args) {
		String str = "My name is Ram" ;
        
        String lowercaseString = str.toLowerCase();
       
        String removeSpaces = lowercaseString.replaceAll(" ", "");
		for (int i = 0; i < removeSpaces.length(); i++)
		{
            char c = removeSpaces.charAt(i);
            System.out.println(c);
        }
	}
}