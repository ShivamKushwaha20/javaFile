// Base class
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass 1
class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Subclass 2
class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class DynamicMethodDemo {
    public static void main(String[] args) {
        // Create objects of different types
        Animal animal1 = new Dog(); // Dynamic binding
        Animal animal2 = new Cat(); // Dynamic binding

        // Call the makeSound method (dynamically dispatched)
        animal1.makeSound(); // Calls Dog's makeSound method
        animal2.makeSound(); // Calls Cat's makeSound method
    }
}
