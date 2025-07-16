package org.example.java8.datetimeapi;

import java.time.LocalTime;

public class LocalTimeExample {

    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        LocalTime specificTime = LocalTime.of(14, 30, 45);

        System.out.println("Current Time: " + now);
        System.out.println("Specific Time: " + specificTime);
    }
}
