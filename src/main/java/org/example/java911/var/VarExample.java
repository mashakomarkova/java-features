package org.example.java911.var;

import java.util.HashMap;
import java.util.List;

public class VarExample {

    public static void main(String[] args) {
        String message = "Hello, Java 10!";
        int number = 10;

        var message1 = "Hello, Java 10!"; //automatically infers the type
        var number1 = 10;

        var numbers = List.of(1, 2, 3, 4, 5);
        for (var num : numbers) {
            System.out.print(num + " ");
        }

        var names = List.of("Alice", "Bob", "Charlie");
        var filteredNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .toList();
    }

    private static int testA() {
        return 0;
    }

}
