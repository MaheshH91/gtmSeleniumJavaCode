package batch35;

public class Try_PRogram {
	public static void main(String[] args) {
		try {
			int c = 1 / 0;
			System.out.println(c);

		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		try {
			int c = 1 / 0;
			System.out.println(c);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		try {
			int c = 1 / 0;
			System.out.println(c);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
		try {
			int c = 1 / 0;
			System.out.println(c);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getLocalizedMessage());
		}
		
	}
	//https://us06web.zoom.us/j/87941908749?pwd=UE4vcHlUa3NyWmdreTkwWmZtS1JiUT09
}
