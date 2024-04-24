public class TryNestedDemo {
    public static void main(String[] args) {
        try {
            // Call a method that contains another try block
            outerMethod();
        } catch (Exception ex) {
            System.out.println("Caught exception in main method: " + ex.getMessage());
        }
    }

    public static void outerMethod() throws Exception {
        System.out.println("Outer method starts");
        innerMethod();
        System.out.println("Outer method ends");
    }

    public static void innerMethod() throws Exception {
        try {
            System.out.println("Inner method starts");
            // Simulate an exception
            int result = 10 / 0; // This will throw an ArithmeticException
            System.out.println("Inner method ends");
        } catch (ArithmeticException ex) {
            System.out.println("Caught exception in innerMethod: " + ex.getMessage());
            throw new Exception("Exception thrown from innerMethod", ex);
        }
    }
}
