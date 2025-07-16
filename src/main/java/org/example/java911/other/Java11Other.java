package org.example.java911.other;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java11Other {

    public static void main(String[] args) {
        //before java 11
        List<String> names = List.of("Alice", " ", "Bob", "  ", "Charlie");
        List<String> filteredNames = names.stream()
                .filter(name -> !name.isBlank())  // Negation using !
                .toList();
        System.out.println(filteredNames);

        //new Predicate.not method
        List<String> filteredNamesWithPredicate = names.stream()
                .filter(Predicate.not(String::isBlank))
                .collect(Collectors.toList());
        System.out.println(filteredNamesWithPredicate);

        //before java 11
        List<String> list = List.of("Java", "Python", "C++");
        String[] array = list.toArray(new String[list.size()]);

        //java 11 update
        List<String> languages = List.of("Java", "Python", "C++");
        // Using Java 11's improved method
        String[] array2 = languages.toArray(String[]::new);
        System.out.println(Arrays.toString(array2));

    }
}
