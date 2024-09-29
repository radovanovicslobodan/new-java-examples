package org.example;

class Util {
    public static <T> T getLastElement(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        return array[array.length - 1];
    }
}

public class GenericMethodExample {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"apple", "banana", "cherry"};

        Integer lastInt = Util.getLastElement(intArray);
        String lastString = Util.getLastElement(stringArray);

        System.out.println("Last Integer: " + lastInt);
        System.out.println("Last String: " + lastString);
    }
}