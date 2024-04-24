public class FinallyBlockDemo {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            System.out.println("Finally block always executes");
        }
    }

    public static int divide(int dividend, int divisor) {
        return dividend / divisor;
    }
}
