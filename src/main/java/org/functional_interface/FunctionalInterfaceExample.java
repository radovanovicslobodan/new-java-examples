package org.functional_interface;

@FunctionalInterface
interface Square {
    int calculate(int x);
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        int a = 5;

        // lambda expression to define the calculate method
        Square s = (int x) -> x * x;

        Square s1 = new Square() {
            @Override
            public int calculate(int x) {
                return x * x;
            }
        };

        // parameter passed and return type must be
        // same as defined in the prototype
        int ans = s.calculate(a);
        int ans1 = s1.calculate(a);
        System.out.println(ans1);
    }
}