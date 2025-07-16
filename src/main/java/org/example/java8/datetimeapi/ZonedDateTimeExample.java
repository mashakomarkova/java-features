package org.example.java8.datetimeapi;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {

    public static void main(String[] args) {
        ZonedDateTime nowInUTC = ZonedDateTime.now(ZoneId.of("UTC"));
        ZonedDateTime nowInNY = ZonedDateTime.now(ZoneId.of("America/New_York"));

        System.out.println("UTC Time: " + nowInUTC);
        System.out.println("New York Time: " + nowInNY);
    }
}
