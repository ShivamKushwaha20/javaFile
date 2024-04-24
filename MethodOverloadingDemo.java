public class MethodOverloadingDemo {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloadingDemo demo = new MethodOverloadingDemo();

        // Call the overloaded methods
        System.out.println("Sum of 5 and 10: " + demo.add(5, 10));
        System.out.println("Sum of 5, 10, and 15: " + demo.add(5, 10, 15));
        System.out.println("Sum of 2.5 and 3.7: " + demo.add(2.5, 3.7));
    }
}
