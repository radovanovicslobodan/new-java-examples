package org.example;

interface Pair<K, V> {
    K getKey();

    V getValue();
}

class OrderedPair<K, V> implements Pair<K, V> {
    private K key;
    private V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

public class GenericInterfaceExample {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new OrderedPair<>(1, "One");
        System.out.println("Key: " + pair.getKey());
        System.out.println("Value: " + pair.getValue());
    }
}