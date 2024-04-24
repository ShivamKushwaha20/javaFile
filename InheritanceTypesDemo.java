// Base class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Single inheritance: Dog inherits from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Multilevel inheritance: Puppy inherits from Dog
class Puppy extends Dog {
    void play() {
        System.out.println("Puppy is playing");
    }
}

// Hierarchical inheritance: Cat inherits from Animal
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

// Interface for multiple inheritance
interface Pet {
    void cuddle();
}

// Class implementing the interface
class PetDog extends Dog implements Pet {
    public void cuddle() {
        System.out.println("Dog is cuddling");
    }
}

public class InheritanceTypesDemo {
    public static void main(String[] args) {
        // Single inheritance example
        Dog myDog = new Dog();
        myDog.eat();
        myDog.bark();

        System.out.println();

        // Multilevel inheritance example
        Puppy myPuppy = new Puppy();
        myPuppy.eat();
        myPuppy.bark();
        myPuppy.play();

        System.out.println();

        // Hierarchical inheritance example
        Cat myCat = new Cat();
        myCat.eat();
        myCat.meow();

        System.out.println();

        // Interface for multiple inheritance example
        PetDog petDog = new PetDog();
        petDog.eat();
        petDog.bark();
        petDog.cuddle();
    }
}
