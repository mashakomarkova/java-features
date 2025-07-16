package org.example.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie");

        // Creating a stream from a list
        Stream<String> stream = names.stream();

        // Using forEach to print elements
        stream.forEach(name -> System.out.println("Name: " + name));

        withoutStream();
        functional();
    }

    public static void withoutStream() {
        List<String> names = Arrays.asList("Anna", "John", "Mike");

        List<String> filteredNames = new ArrayList<>();

        for (String name : names) {
            if (name.startsWith("A")) {
                filteredNames.add(name.toUpperCase());
            }
        }

        System.out.println(filteredNames);
    }

    public static void functional() {
        List<String> names = Arrays.asList("Anna", "John", "Mike");
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(filteredNames);
    }
}
