package assignment1;

/*Arrays:

Output:

Student1
=================
Nam1
7
94579
Nam1@gmail.com

Student2
=================
Nam2
4
94577
Nam2@gmail.com

Student3
=================
Nam3
6
94567
Nam3@gmail.com
*/

class Assignment43 extends SuperClasssss {

	public static void main(String[] args) {
		String name[] = new String[4];
		name[0] = "Name";
		name[1] = "Nam1";
		name[2] = "Nam2";
		name[3] = "Nam3";

		String age[] = new String[4];
		age[0] = "Age";
		age[1] = "7";
		age[2] = "4";
		age[3] = "6";

		String mob[] = new String[4];
		mob[0] = "MOB";
		mob[1] = "94579";
		mob[2] = "94577";
		mob[3] = "94567";

		String email[] = new String[4];
		email[0] = "Eamailid";
		email[1] = "Nam1@gmail.com";
		email[2] = "Nam2@gmail.com";
		email[3] = "Nam3@gmail.com";

		for (int i = 1; i <= 3; i++) {
			System.out.println("Student" + i);
			System.out.println("=================");
			System.out.println(name[i]);
			System.out.println(age[i]);
			System.out.println(mob[i]);
			System.out.println(email[i]);
			System.out.println();

		}
	}
}