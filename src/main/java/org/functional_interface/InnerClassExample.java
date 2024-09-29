package org.functional_interface;

public class InnerClassExample {
    public static void main(String[] args) {
        // create anonymous inner class object
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("New thread created");
            }
        }).start();
    }
}