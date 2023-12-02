package assignment1;

/*
Given the size of array as 3, try to pass 4 values in it and handle the exception.
*/
public class Assignment48 {
	public static void main(String[] args) {
		int arr[] = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		try {
			arr[3] = 40;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bounds exception caught");
		}
		// Print the elements of the array
		for (int i = 0; i < arr.length; i++) {
			System.out.print( arr[i]+" ");
		}
	}
}