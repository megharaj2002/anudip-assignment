class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The dog barks");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("The Cat meows");
    }
}

public class Assignment2 {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myAnimal.makeSound();
        myCat.makeSound();
        myDog.makeSound();
    }
}
