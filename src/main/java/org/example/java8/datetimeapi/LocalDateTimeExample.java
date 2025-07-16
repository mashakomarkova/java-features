package org.example.java8.datetimeapi;

import java.time.LocalDateTime;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime specificDateTime = LocalDateTime.of(2025, 3, 10, 14, 30);

        System.out.println("Current DateTime: " + now);
        System.out.println("Specific DateTime: " + specificDateTime);
    }
}
