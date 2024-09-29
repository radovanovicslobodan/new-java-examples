package org.castexamples;

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

    void dummyDogMethod() {
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat meows");
    }

    void scratch() {
        System.out.println("Cat scratches");
    }

    void dummyCatMethod() {
    }
}

public class CastMismatchExample {
    public static void main(String[] args) {
        Animal animal = new Cat(); // Creating a Cat instance and referencing it as an Animal
        
        // Incorrect cast: Attempting to cast a Cat instance to Dog
        Dog incorrectDogCast = (Dog) animal;

        // This will result in a ClassCastException at runtime
        incorrectDogCast.makeSound();
    }
}