package org.example.java1224.unnamedvariablesandclasses;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class UnnamedVariablesExample {

    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Mark", "John");

        for (var _ : names) {
            System.out.println("Processing...");
        }

        try {
            int result = 10 / 0; // This will throw ArithmeticException
        } catch (ArithmeticException _) {
            System.out.println("Cannot divide by zero.");
        }

        try (BufferedReader _ = new BufferedReader(new FileReader("file.txt"))) {
            System.out.println("File opened successfully.");
        } catch (IOException e) {
            System.out.println("Error handling the file.");
        }

        names.forEach(_ -> {
            System.out.println("processing");
        });


    }

    void checkPerson(Person person) {
        switch (person) {
            case Person(var _, var age) -> System.out.println(age + " years old.");
        }
    }
}
record Person(String name, int age) {}