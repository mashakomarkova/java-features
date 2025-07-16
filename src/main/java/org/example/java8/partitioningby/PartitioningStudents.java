package org.example.java8.partitioningby;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student {
    String name;
    int score; // 0-100 score 60=passed

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class PartitioningStudents {

    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Alice", 85),
                new Student("Bob", 55),
                new Student("Clara", 78),
                new Student("David", 40)
        );

        Map<Boolean, List<Student>> partitioned = students.stream()
                .collect(Collectors.partitioningBy(s -> s.score >= 60));

        System.out.println("Passed");
        partitioned.get(true).forEach((s) -> System.out.println(s.name));

        System.out.println("\nFailed");
        partitioned.get(false).forEach((s) -> System.out.println(s.name));


    }
}
