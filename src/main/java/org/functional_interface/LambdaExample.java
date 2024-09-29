package org.functional_interface;

public class LambdaExample {
    public static void main(String[] args) {
        // lambda expression to create the object
        new Thread(() -> System.out.println("New thread created")).start();
    }
}