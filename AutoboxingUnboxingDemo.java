public class AutoboxingUnboxingDemo {
    public static void main(String[] args) {
        // Autoboxing: primitive int to Integer object
        int primitiveValue = 42;
        Integer integerValue = primitiveValue;

        System.out.println("Autoboxing: int to Integer");
        System.out.println("Primitive value: " + primitiveValue);
        System.out.println("Integer value: " + integerValue);

        // Unboxing: Integer object to primitive int
        Integer boxedValue = 100;
        int unboxedValue = boxedValue;

        System.out.println("\nUnboxing: Integer to int");
        System.out.println("Integer value: " + boxedValue);
        System.out.println("Unboxed value: " + unboxedValue);

        // Autoboxing and unboxing in method parameters and return values
        int sum = addNumbers(5, 10); // Autoboxing: primitive int to Integer
        Integer product = multiplyNumbers(3, 7); // Autoboxing: primitive int to Integer
        int result = product; // Unboxing: Integer to primitive int

        System.out.println("\nMethod with autoboxing and unboxing:");
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Result: " + result);
    }

    public static int addNumbers(Integer a, Integer b) {
        // Unboxing: Integer to primitive int
        return a + b;
    }

    public static Integer multiplyNumbers(int a, int b) {
        // Autoboxing: primitive int to Integer
        return a * b;
    }
}
