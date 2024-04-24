class MyClass {
    MyClass() {
        System.out.println("Default constructor called");
    }

    MyClass(int value) {
        System.out.println("Parameterized constructor called with value: " + value);
    }
}

public class ConstructorCallDemo {
    public static void main(String[] args) {
        // Create objects of MyClass with different constructors
        MyClass obj1 = new MyClass(); // Calls default constructor
        MyClass obj2 = new MyClass(10); // Calls parameterized constructor
    }
}
