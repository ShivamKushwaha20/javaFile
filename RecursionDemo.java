public class RecursionDemo {
    // Recursive method to calculate factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        } else {
            return n * factorial(n - 1); // Recursive call to calculate factorial
        }
    }

    public static void main(String[] args) {
        int number = 5;
        int factorialOfNumber = factorial(number);
        System.out.println("Factorial of " + number + " is: " + factorialOfNumber);
    }
}
