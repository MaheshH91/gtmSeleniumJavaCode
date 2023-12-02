package batch35;
public class StringFunctionsDemo {
    public static void main(String[] args) {
        // Creating sample strings
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "Java Programming";
        String str4 = "I love Java. Java is great!";
        String str5 = "apple,banana,cherry";
        String str6 = "   Mahesh ";
        String str7 = "HELLO";
        
        // 1. equals(Object obj)
        boolean areEqual = str1.equals(str2); // false
        
        // 2. equalsIgnoreCase(String anotherString)
        boolean areEqualIgnoreCase = str1.equalsIgnoreCase(str7); // true
        
        // 3. startsWith(String prefix) and endsWith(String suffix)
        boolean startsWithHello = str1.startsWith("Hello"); // true
        boolean endsWithWorld = str2.endsWith("World"); // true
        
        // 4. contains(CharSequence sequence)
        boolean containsJava = str3.contains("Java"); // true
        boolean containsPython = str3.contains("Python"); // false
        
        // 5. replace(CharSequence target, CharSequence replacement)
        String replaced = str4.replace("Java", "Python");
        
        // 6. split(String regex)
        String[] fruits = str5.split(",");
        
        // 7. charAt(int index)
        char charAtIndex2 = str1.charAt(2); // 'l'
        
        // 8. isEmpty()
        boolean isEmpty = str6.isEmpty(); // false
        
        // 9. substring(int beginIndex, int endIndex)
        String substring = str2.substring(2, 4); // "rl"
        
        // 10. trim()
        String trimmed = str6.trim(); // "Mahesh"
        
        // Output results
        System.out.println("1. equals(Object obj): " + areEqual);
        System.out.println("2. equalsIgnoreCase(String anotherString): " + areEqualIgnoreCase);
        System.out.println("3. startsWith and endsWith: " + startsWithHello + ", " + endsWithWorld);
        System.out.println("4. contains(CharSequence sequence): " + containsJava + ", " + containsPython);
        System.out.println("5. replace(CharSequence target, CharSequence replacement): " + replaced);
        System.out.println("6. split(String regex): ");
        for (String fruit : fruits) {
            System.out.println("   - " + fruit);
        }
        System.out.println("7. charAt(int index): " + charAtIndex2);
        System.out.println("8. isEmpty(): " + isEmpty);
        System.out.println("9. substring(int beginIndex, int endIndex): " + substring);
        System.out.println("10. trim(): " + trimmed);
    }
}

