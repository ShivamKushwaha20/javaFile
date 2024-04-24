// Base interface
interface Animal {
    void makeSound();
}

// Sub-interface inheriting from Animal
interface Pet extends Animal {
    void cuddle();
}

// Implementing class for Animal interface
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
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

public class InterfaceInheritanceDemo {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Pet cat = new Cat();

        dog.makeSound(); // Calls Dog's makeSound method
        cat.makeSound(); // Calls Cat's makeSound method
        cat.cuddle(); // Calls Cat's cuddle method
    }
}
