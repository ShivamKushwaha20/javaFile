public class TypeWrapperDemo {
    public static void main(String[] args) {
        // Using Integer wrapper class
        Integer num1 = new Integer(42); // Creating an Integer object using constructor
        Integer num2 = Integer.valueOf(100); // Creating an Integer object using valueOf method
        Integer num3 = 75; // Autoboxing: primitive int to Integer

        // Performing operations using Integer objects
        int sum = num1 + num2; // Unboxing: Integer + Integer, then implicit casting to int
        int difference = num2 - num3; // Unboxing: Integer - Integer, then implicit casting to int

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);

        // Converting Integer to primitive int explicitly
        int intValue = num1.intValue();
        System.out.println("Integer value: " + intValue);

        // Converting String to Integer using parseInt method
        String strNum = "123";
        Integer parsedInt = Integer.parseInt(strNum);
        System.out.println("Parsed Integer: " + parsedInt);

        // Using Integer constants
        System.out.println("Maximum value of Integer: " + Integer.MAX_VALUE);
        System.out.println("Minimum value of Integer: " + Integer.MIN_VALUE);
    }
}
