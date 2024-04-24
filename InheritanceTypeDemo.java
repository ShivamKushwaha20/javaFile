class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }

    void playFetch() {
        System.out.println("Dog plays fetch");
    }
}

public class InheritanceTypeDemo {
    public static void main(String[] args) {
        // Declare and initialize a variable of type Animal with a Dog object
        Animal myAnimal = new Dog();

        // Call the makeSound method (inferred type is Animal)
        myAnimal.makeSound(); // Calls Dog's makeSound method

        // Cannot call playFetch method as it's not part of the Animal type
        // myAnimal.playFetch(); // Compilation error

        // Cast to Dog type to access Dog-specific methods
        Dog myDog = (Dog) myAnimal;
        myDog.playFetch(); // Calls Dog's playFetch method
    }
}
