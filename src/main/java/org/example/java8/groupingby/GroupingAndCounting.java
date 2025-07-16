package org.example.java8.groupingby;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingAndCounting {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "apple", "cherry", "banana", "banana");

        Map<String, Long> fruitCount = fruits.stream()
                .collect(Collectors.groupingBy(fruit -> fruit, Collectors.counting()));

        System.out.println(fruitCount);
    }
}
