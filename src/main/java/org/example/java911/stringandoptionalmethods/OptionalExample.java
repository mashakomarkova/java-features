package org.example.java911.stringandoptionalmethods;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        Optional<String> emptyOptional = Optional.empty();
        System.out.println(emptyOptional.isEmpty()); // alternative to !emptyOptional.isPresent()
    }
}
