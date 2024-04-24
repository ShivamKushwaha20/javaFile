public class NestedTryDemo {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50 };
        
        try {
            // Outer try block
            for (int i = 0; i <= numbers.length; i++) {
                try {
                    // Inner try block
                    int result = 100 / numbers[i];
                    System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("ArithmeticException caught: " + e.getMessage());
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Inside finally block.");
        }
        
        System.out.println("Outside try-catch-finally blocks.");
    }
}
