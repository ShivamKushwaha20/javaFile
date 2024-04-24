// Base class
class Animal {
    // Final method that cannot be overridden
    final void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass 1
class Dog extends Animal {
    // Attempting to override the final method (will result in a compilation error)
    // void makeSound() {
    //     System.out.println("Dog barks");
    // }
}

// Subclass 2
class Cat extends Animal {
    // Overriding the final method (will result in a compilation error)
    // void makeSound() {
    //     System.out.println("Cat meows");
    // }
}

public class FinalKeywordDemo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound(); // Calls Animal's makeSound method

        // Uncomment the below lines to see compilation errors due to final method override attempts
        // Dog dog = new Dog();
        // dog.makeSound(); // Results in compilation error

        // Cat cat = new Cat();
        // cat.makeSound(); // Results in compilation error
    }
}
