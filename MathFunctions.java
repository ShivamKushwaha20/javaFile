public class MathFunctions {
    public static void main(String[] args) {
        // Integer math
        int a = 10;
        int b = 5;
        int sumInt = a + b;
        int differenceInt = a - b;
        int productInt = a * b;
        int quotientInt = a / b;
        int modulusInt = a % b;

        System.out.println("Integer Math:");
        System.out.println("Sum: " + sumInt);
        System.out.println("Difference: " + differenceInt);
        System.out.println("Product: " + productInt);
        System.out.println("Quotient: " + quotientInt);
        System.out.println("Modulus: " + modulusInt);

        // Floating-point math
        double x = 10.5;
        double y = 3.5;
        double sumDouble = x + y;
        double differenceDouble = x - y;
        double productDouble = x * y;
        double quotientDouble = x / y;

        System.out.println("\nFloating-point Math:");
        System.out.println("Sum: " + sumDouble);
        System.out.println("Difference: " + differenceDouble);
        System.out.println("Product: " + productDouble);
        System.out.println("Quotient: " + quotientDouble);

        // Mixed data types
        int intNum = 10;
        double doubleNum = 3.5;
        double mixedResult = intNum + doubleNum;

        System.out.println("\nMixed Data Types:");
        System.out.println("Result of int + double: " + mixedResult);
    }
}
