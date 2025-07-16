package org.example.java911.factorymethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FactoryMethodsExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        List<String> unmodifiableList = Collections.unmodifiableList(list);
        System.out.println(unmodifiableList);

        List<String> fruits = List.of("Apple", "Banana", "Orange");
        System.out.println(fruits);
        fruits.add("value");

        Set<String> fruitSet = Set.of("Apple", "Banana", "Orange", "Orange");
        System.out.println(fruitSet);

        Map<Integer, String> students = Map.of(
                1, "Alice",
                2, "Bob",
                3, "Charlie",
                4,"Charlie"
        );
        System.out.println(students);
    }
}
