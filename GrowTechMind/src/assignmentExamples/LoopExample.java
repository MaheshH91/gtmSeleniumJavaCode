package assignmentExamples;
public class LoopExample {
    public static void main(String[] args) {
        int i = 0;  // Initialize i to 0
        
        // The loop condition i < 0 is false from the start, so the loop won't run
        for (i = 2; i < 0; i++) {
            System.out.println("Name");  // This will not be executed
        }
        
        // 'i' still holds its initial value of 0
        System.out.println(i);  // This will print 0
    }
}
