package org.example.java8.groupingby;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {

    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "cherry", "date", "fig", "grape"); // apple, grape = 5 characters

        Map<Integer, List<String>> groupedByLength = words.stream()
                .collect(Collectors.groupingBy(String::length)); //5, list of apple, grape

        System.out.println(groupedByLength);
    }
}
