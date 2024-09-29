package org.example;

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }

    void fetch() {
        System.out.println("Dog fetches a ball");
    }
}

class Cat {

}

public class Casting {

    public static void main(String[] args) {
        Animal animal = new Dog(); // Upcasting
        animal.makeSound(); // Calls Dog's makeSound()

        // Downcasting
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.fetch(); // Accessing Dog-specific method
        }
    }
}