package org.example.java8.flatmap;

import java.util.List;
import java.util.stream.Collectors;

public class FlatmapExample {
    public static void main(String[] args) {
        List<List<String>> list = List.of(
                List.of("a", "b"),
                List.of("c", "d")
        ); //a,b,c,d

        List<String> flat = list.stream()
                .flatMap(nested -> nested.stream())
                .collect(Collectors.toList());

        System.out.println(flat);

    }
}
