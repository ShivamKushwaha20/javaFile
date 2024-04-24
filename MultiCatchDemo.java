public class MultiCatchDemo {
    public static void main(String[] args) {
        try {
            // Simulate an array index out of bounds exception
            int[] numbers = {1, 2, 3};
            int index = 5;
            int value = numbers[index];
            System.out.println("Value at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException ex) {
            System.out.println("Caught exception: " + ex.getMessage());
        }
    }
}
