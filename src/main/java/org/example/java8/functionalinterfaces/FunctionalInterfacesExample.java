package org.example.java8.functionalinterfaces;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FunctionalInterfacesExample {

    public static void main(String[] args) {
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println(isEven.test(10)); // Output: true

        Function<String, Integer> lengthFunction = str -> str.length();
        System.out.println(lengthFunction.apply("Java")); // Output: 4

        Consumer<String> printConsumer = message -> System.out.println("Message: " + message);
        printConsumer.accept("Hello, Java 8!"); // Output: Message: Hello, Java 8!

        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println(randomSupplier.get()); // Output: Random number

        UnaryOperator<Integer> square = num -> num * num;
        System.out.println(square.apply(5)); // Output: 25

        BiFunction<Integer, Integer, String> sumToString = (a, b) -> "Sum: " + (a + b);
        System.out.println(sumToString.apply(5, 10)); // Output: Sum: 15

        BinaryOperator<Integer> sum = (a, b) -> a + b;
        System.out.println(sum.apply(10, 20)); // Output: 30

        BiPredicate<Integer, Integer> greaterThan = (a, b) -> a > b;
        System.out.println(greaterThan.test(10, 5)); // Output: true

        BiConsumer<String, Integer> printDetails = (name, age) ->
                System.out.println(name + " is " + age + " years old.");
        printDetails.accept("Alice", 25); // Output: Alice is 25 years old.



    }

}
