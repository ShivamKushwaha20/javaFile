public class EqualsVsOperatorDemo {
    public static void main(String[] args) {
        // Creating two String objects with the same value
        String str1 = new String("Hello");
        String str2 = new String("Hello");

        // Using equals() method to compare objects
        boolean isEqualUsingEquals = str1.equals(str2);
        System.out.println("Using equals(): " + isEqualUsingEquals);

        // Using == operator to compare object references
        boolean isEqualUsingOperator = (str1 == str2);
        System.out.println("Using == operator: " + isEqualUsingOperator);

        // Creating two Integer objects with the same value
        Integer num1 = new Integer(42);
        Integer num2 = new Integer(42);

        // Using equals() method to compare objects
        boolean isNumEqualUsingEquals = num1.equals(num2);
        System.out.println("Using equals() for Integer objects: " + isNumEqualUsingEquals);

        // Using == operator to compare object references
        boolean isNumEqualUsingOperator = (num1 == num2);
        System.out.println("Using == operator for Integer objects: " + isNumEqualUsingOperator);

        // Using == operator to compare primitive values
        int a = 10;
        int b = 10;
        boolean isPrimitiveEqual = (a == b);
        System.out.println("Using == operator for primitive ints: " + isPrimitiveEqual);
    }
}
