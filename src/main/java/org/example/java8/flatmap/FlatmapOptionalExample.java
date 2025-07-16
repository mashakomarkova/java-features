package org.example.java8.flatmap;

import java.util.Optional;
import java.util.function.Function;

public class FlatmapOptionalExample {

    public static void main(String[] args) {
        Optional<Optional<String>> nestedOptional = Optional.of(Optional.of("Hello"));

        Optional<String> flatResult = nestedOptional.flatMap(Function.identity());

        System.out.println(flatResult.get());
    }
}
