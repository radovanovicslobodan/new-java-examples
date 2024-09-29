package org.example;

class Box<T> {
    private T content;

    public Box(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}

public class GenericClassExample {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(42);
        Box<String> stringBox = new Box<>("Hello, Generics!");

        System.out.println("Integer Box Content: " + intBox.getContent());
        System.out.println("String Box Content: " + stringBox.getContent());
    }
}