public class StaticDemo {
    // Static variable
    static int staticVariable = 0;

    // Static block
    static {
        System.out.println("Inside static block");
        staticVariable = 10;
    }

    // Static method
    static void staticMethod() {
        System.out.println("Inside static method");
        System.out.println("Static variable value: " + staticVariable);
    }

    public static void main(String[] args) {
        // Access static variable directly
        System.out.println("Accessing static variable directly: " + staticVariable);

        // Call static method
        staticMethod();

        // Access static variable after changes
        System.out.println("Accessing static variable after changes: " + staticVariable);
    }
}
