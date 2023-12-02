package assignmentExamples;
import java.util.HashSet;
import java.util.Set;

public class UniqueRandomNumbers {
    public static void main(String[] args) {
        Set<Double> uniqueNumbers = new HashSet<>();
        int iterations = 100000000;

        for (int i = 0; i < iterations; i++) {
            double randomNumber = Math.random();
            uniqueNumbers.add(randomNumber);
        }

        if (uniqueNumbers.size() == iterations) {
            System.out.println("All " + iterations + " generated values are different.");
        } else {
            System.out.println("Generated values are not all different.");
        }
    }
}
