class StaticExample {
    // Static variable
    static int count = 0;

    // Static block
    static {
        System.out.println("Static block executed.");
    }

    // Static method
    static void incrementCount() {
        count++;
    }

    // Static method
    static void displayCount() {
        System.out.println("Count: " + count);
    }
}

public class StaticDemo2 {
    public static void main(String[] args) {
        // Accessing static variable and method without creating an object
        StaticExample.incrementCount();
        StaticExample.displayCount();

        // Accessing static variable and method using object
        StaticExample obj1 = new StaticExample();
        obj1.incrementCount();
        obj1.displayCount();

        StaticExample obj2 = new StaticExample();
        obj2.incrementCount();
        obj2.displayCount();
    }
}
