package assignment1;

import java.util.HashSet;

/*
With for loop run math.random 100 times and conclude if outputs are different.*/
public class Assignment49 {
	public static void main(String[] args) {
		// Generate and store random values
		HashSet<Double> randomNumbers = new HashSet<Double>();
		for (int i = 0; i < 100; i++) {
			double randomNumber = Math.random();
			randomNumbers.add(randomNumber);
			System.out.println(randomNumber);
		}
		if (randomNumbers.size() == 100) {
			System.out.println("All nubers are unique");
		} else {
			System.out.println("Some random numbers are same");
		}
	}
}