public class CastDemo {
    public static void main(String[] args) {
        // Implicit casting (widening conversion)
        int intValue = 10;
        double doubleValue = intValue; // int to double
        System.out.println("Implicit casting (widening): " + doubleValue);

        // Explicit casting (narrowing conversion)
        double doubleNum = 20.5;
        int intNum = (int) doubleNum; // double to int
        System.out.println("Explicit casting (narrowing): " + intNum);

        // Casting with different data types
        char charValue = 'A';
        int asciiValue = (int) charValue; // char to int (ASCII value)
        System.out.println("Casting char to int (ASCII value): " + asciiValue);

        // Casting with object types (upcasting and downcasting)
        Object obj = "Hello"; // Upcasting to Object
        String str = (String) obj; // Downcasting to String
        System.out.println("Upcasting and Downcasting: " + str);
    }
}
