package assignment1;

//Assignment 9 Nested if else

public class Assignment9 {

    public static void main(String[] args) {
        int age = 5;

        if (age > 18) {
            // Person is over 18
            if (age > 60) {
                System.out.println("Print senior citizen half ticket");
            } else {
                System.out.println("Print Adult full ticket");
            }
        } else {
            // Person is 18 or younger
            if (age > 6) {
                System.out.println("Print child half  ticket");
            } else {
                System.out.println("Print child free  ticket");
            }
        }
    }
}
