package interviewPrograms;

public class PrimeNumberCheck {

	public static void main(String[] args) {

		int number = 23;
		boolean flag =false;
		for(int i= 2; i<= number/2;++i) {
			if(number%i ==0) {
				flag = true;
				break;
			}
			
		}
		if(!(flag)) {
			System.out.println(flag);
			System.out.println("The "+number+" is Prime number");
		}
		else {
			System.out.println(flag);
			System.out.println("  The "+number+" is not Prime number");
		}
	}

}
