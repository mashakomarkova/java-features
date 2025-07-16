package org.example.java8.streammethods;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethodsExamples {
    public static void main(String[] args) {
        allMatchAnyMatchNoneMatch();
    }

    private static void methodDistinct() {
        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 4, 5);
        List<Integer> uniqueNumbers = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueNumbers);
    }

    private static void methodSorted() {
        List<Integer> numbers = List.of(5, 1, 3, 2, 4);
        List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedNumbers);
    }
//
    private static void methodLimitAndSkip() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        System.out.println(numbers.stream().limit(3).collect(Collectors.toList()));
        System.out.println(numbers.stream().skip(2).collect(Collectors.toList()));
    }
//
    private static void methodReduce() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);
    }
//
    private static void allMatchAnyMatchNoneMatch() {
        List<Integer> numbers = List.of(2, 4, 6, 8);
        System.out.println(numbers.stream().allMatch(n -> n % 2 == 0));  // true
        System.out.println(numbers.stream().anyMatch(n -> n > 5));       // true
        System.out.println(numbers.stream().noneMatch(n -> n < 0));      // true

        System.out.println(Stream.<Integer>empty().allMatch(n -> n % 2 == 0));
        System.out.println(Stream.<Integer>empty().anyMatch(n -> n % 2 == 0));
        System.out.println(Stream.<Integer>empty().noneMatch(n -> n % 2 == 0));
    }
}
