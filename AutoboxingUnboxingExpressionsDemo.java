public class AutoboxingUnboxingExpressionsDemo {
    public static void main(String[] args) {
        // Autoboxing and unboxing in expressions
        Integer a = 5; // Autoboxing: primitive int to Integer
        Integer b = 3; // Autoboxing: primitive int to Integer

        System.out.println("Autoboxing and unboxing in expressions:");
        System.out.println("Integer a: " + a);
        System.out.println("Integer b: " + b);

        Integer sum = a + b; // Autoboxing: Integer + Integer, unboxing: Integer to int
        System.out.println("Sum: " + sum);

        Integer product = a * b; // Autoboxing: Integer * Integer, unboxing: Integer to int
        System.out.println("Product: " + product);

        // Autoboxing and unboxing in comparisons
        Integer x = 10; // Autoboxing: primitive int to Integer
        Integer y = 10; // Autoboxing: primitive int to Integer

        System.out.println("\nAutoboxing and unboxing in comparisons:");
        System.out.println("Integer x: " + x);
        System.out.println("Integer y: " + y);

        if (x.equals(y)) { // Autoboxing: Integer.equals(Integer), unboxing: Integer to int
            System.out.println("x is equal to y");
        }

        // Autoboxing and unboxing in conditional expressions
        int value = 42; // Primitive int
        Integer result = value > 50 ? value : null; // Autoboxing: primitive int to Integer

        System.out.println("\nAutoboxing and unboxing in conditional expressions:");
        System.out.println("Value: " + value);
        System.out.println("Result: " + result);
    }
}
