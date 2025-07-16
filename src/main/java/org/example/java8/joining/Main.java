package org.example.java8.joining;

import java.util.List;
import java.util.stream.Collectors;

class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Alice", "Smith"),
                new Person("Bob", "Johnson"),
                new Person("Charlie", "Brown")
        );

        String result = people.stream()
                .map(person -> person.getFirstName() + " " + person.getLastName()) // Transform to full name
                .collect(Collectors.joining(", ", "[", "]")); // Join with formatting

        System.out.println(result);
    }
}