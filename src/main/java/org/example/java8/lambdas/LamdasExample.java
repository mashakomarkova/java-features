package org.example.java8.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class LamdasExample {

    public static void main(String[] args) {
        MyFunctionalInterface greetingAnonymous = new MyFunctionalInterface() {
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }
        };

        MyFunctionalInterface greeting = () -> System.out.println("Hello, World!"); //lambda
        greeting.sayHello();  // Output: Hello, World!

        MathOperation addition = (a, b) -> {
            System.out.println("a + b=");
            return a + b;
        };
        MathOperation multiplication = (a, b) -> a * b;

        System.out.println(addition.operate(5, 3));
        System.out.println(multiplication.operate(5, 3));

        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);

        Collections.sort(numbers, (a, b) -> a - b);
    }
}

interface MyFunctionalInterface {
    void sayHello();
}

interface MathOperation {
    int operate(int a, int b);

    default void another() {

    }
}