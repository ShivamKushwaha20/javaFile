public class UncheckedExceptionDemo {
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 0;

        try {
            // Attempting division by zero, which results in ArithmeticException
            int result = dividend / divisor;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            // Handling the unchecked exception
            System.err.println("Error: Division by zero is not allowed.");
        }
    }
}
