package batch35;

public class TryMultipleCatch {
	public static void main(String[] args) {
		try {
			int c = 1 / 0;
			System.out.println(c);

		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		}
		catch (NullPointerException e) {
			
			System.out.println("Null Pointer Exception");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch (ArrayStoreException e) {
			System.out.println("ArrayStoreException");
		}
		
		
	}
}
