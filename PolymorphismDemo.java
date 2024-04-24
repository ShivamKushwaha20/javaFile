// Base class
class Animal {
    // Method to make sound
    public void makeSound() {
        System.out.println("Animal makes a generic sound.");
    }
}

// Derived class inheriting from Animal
class Dog extends Animal {
    // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }
}

// Another derived class inheriting from Animal
class Cat extends Animal {
    // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Cat meows.");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        // Create objects of Animal, Dog, and Cat classes
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Call makeSound method of each object
        animal.makeSound(); // Calls makeSound method of Animal class
        dog.makeSound(); // Calls makeSound method overridden in Dog class
        cat.makeSound(); // Calls makeSound method overridden in Cat class
    }
}
