package org.example.java911.newstreammethods;

import java.util.List;
import java.util.stream.Collectors;

public class NewStreamMethodsExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 7, 4, 5, 6);

        List<Integer> result = numbers.stream()
                .takeWhile(n -> n < 5)  // Stop when n is 7 (condition fails)
                .collect(Collectors.toList());

        System.out.println(result);  // Output: [1, 2, 3]

        List<Integer> result2 = numbers.stream()
                .dropWhile(n -> n < 5)  // Skip 1, 2, 3 and start from 7
                .collect(Collectors.toList());

        System.out.println(result2);  // Output: [7, 4, 5, 6]
    }
}
