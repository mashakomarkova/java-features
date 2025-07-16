package org.example.java8.joining;

import java.util.List;
import java.util.stream.Collectors;

public class JoiningExample {

    public static void main(String[] args) {
        List<String> words = List.of("Java", "8", "Stream"); // "Java 8 Stream"
        String result = words.stream()
                .collect(Collectors.joining(",", "[", "]"));

        System.out.println(result);


    }
}
