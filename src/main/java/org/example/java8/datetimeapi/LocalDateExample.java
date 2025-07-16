package org.example.java8.datetimeapi;

import java.time.LocalDate;

public class LocalDateExample {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate specificDate = LocalDate.of(2025, 3, 10);
        System.out.println("Today: " + today);
        System.out.println("Specific Date: " + specificDate);

        System.out.println(specificDate.getYear());
        System.out.println(specificDate.getMonth());
        System.out.println(specificDate.getDayOfMonth());
        System.out.println(specificDate.getDayOfWeek());
    }
}
