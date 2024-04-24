public class MethodOverloadingDemo2 {
    // Method with no parameters
    void display() {
        System.out.println("No parameters");
    }

    // Method with a single int parameter
    void display(int number) {
        System.out.println("Single int parameter: " + number);
    }

    // Method with two int parameters
    void display(int num1, int num2) {
        System.out.println("Two int parameters: " + num1 + " and " + num2);
    }

    // Method with a double parameter
    void display(double number) {
        System.out.println("Double parameter: " + number);
    }

    // Method with a String parameter
    void display(String text) {
        System.out.println("String parameter: " + text);
    }

    public static void main(String[] args) {
        MethodOverloadingDemo demo = new MethodOverloadingDemo();

        // Call different versions of the display method
        demo.display();
        demo.display(10);
        demo.display(5, 7);
        demo.display(3.14);
        demo.display("Hello, Method Overloading");
    }
}
