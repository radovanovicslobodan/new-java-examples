package org.classexample;

class MyClass {
    void printClassInfo(Class<?> clazz) {
        System.out.println("Class Name: " + clazz.getName());
        System.out.println("Simple Name: " + clazz.getSimpleName());
        System.out.println("Package Name: " + clazz.getPackageName());
    }
}

class AnotherClass {
}

public class ClassExample {
    public static void main(String[] args) {
        MyClass myInstance = new MyClass();
//        AnotherClass anotherClass = new AnotherClass();

        myInstance.printClassInfo(MyClass.class);
        myInstance.printClassInfo(AnotherClass.class);
    }
}