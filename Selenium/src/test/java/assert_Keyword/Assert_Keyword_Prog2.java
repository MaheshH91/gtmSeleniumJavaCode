package assert_Keyword;

import java.util.Scanner;

public class Assert_Keyword_Prog2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int rams_age = sc.nextInt();
//		assert rams_age > 18;
		assert rams_age > 18:"You have entered the age is less thaan 18";
		sc.close();
	}

}
