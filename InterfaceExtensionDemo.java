// Base interface
interface Animal {
    void makeSound();
}

// Sub-interface extending Animal
interface Pet extends Animal {
    void cuddle();
}

// Implementing class for Pet interface
class Cat implements Pet {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }

    @Override
    public void cuddle() {
        System.out.println("Cat cuddles");
    }
}

public class InterfaceExtensionDemo {
    public static void main(String[] args) {
        Pet cat = new Cat();

        cat.makeSound(); // Calls Cat's makeSound method
        cat.cuddle(); // Calls Cat's cuddle method
    }
}
