package org.example.java8.datetimeapi;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class WorkWithDateTime {

    public static void main(String[] args) {
        formatting();
    }

    private static void addingAndSubtractingDaysMonthsYears() {
        LocalDate date = LocalDate.of(2025, 3, 10);
        System.out.println(date.plusDays(5));
        System.out.println(date.minusMonths(2));
        System.out.println(date.plusYears(1));
    }

    private static void hoursMinutes() {
        LocalTime time = LocalTime.of(14, 30);
        System.out.println(time.plusHours(3)); // 17:30
        System.out.println(time.minusMinutes(15)); // 14:15
    }

    private static void comparingDateTimes() {
        LocalDate date1 = LocalDate.of(2025, 3, 10);
        LocalDate date2 = LocalDate.of(2024, 12, 25);

        System.out.println(date1.isAfter(date2)); // true
        System.out.println(date1.isBefore(date2)); // false

        LocalTime time1 = LocalTime.of(14, 30);
        LocalTime time2 = LocalTime.of(10, 15);

        System.out.println(time1.isAfter(time2)); // true
        System.out.println(time1.isBefore(time2)); // false
    }

    private static void durationPeriod() {
        LocalTime start = LocalTime.of(10, 0);
        LocalTime end = LocalTime.of(12, 30);

        Duration duration = Duration.between(start, end);
        System.out.println(duration.toHours()); // 2
        System.out.println(duration.toMinutes()); // 150

        LocalDate start1 = LocalDate.of(2020, 5, 10);
        LocalDate end1 = LocalDate.of(2025, 3, 10);

        Period period = Period.between(start1, end1);
        System.out.println(period.getYears() + " years, " + period.getMonths() + " months, " + period.getDays() + " days");
    }

    private static void formatting() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String formattedDate = now.format(formatter);
        System.out.println("Formatted DateTime: " + formattedDate);
    }
}
