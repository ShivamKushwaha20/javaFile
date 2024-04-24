public class AutomaticTypeConversionsDemo {
    // Method to add two integers
    public void add(int a, int b) {
        System.out.println("Adding two integers: " + (a + b));
    }

    // Overloaded method to add a double and an integer
    public void add(double a, int b) {
        System.out.println("Adding a double and an integer: " + (a + b));
    }

    // Overloaded method to add an integer and a double
    public void add(int a, double b) {
        System.out.println("Adding an integer and a double: " + (a + b));
    }

    public static void main(String[] args) {
        AutomaticTypeConversionsDemo demo = new AutomaticTypeConversionsDemo();

        // Call the overloaded methods
        demo.add(5, 10);
        demo.add(2.5, 3); // Implicit conversion: int 3 is promoted to double 3.0
        demo.add(7, 3.5); // Implicit conversion: int 7 is promoted to double 7.0
    }
}
