package org.example.java8.streammethods;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamMethodsAssignment {

    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Alice", 85),
                new Student("Bob", 90),
                new Student("Charlie", 78),
                new Student("David", 95),
                new Student("Eve", 88),
                new Student("Frank", 100)
        );

        List<Student> sortedStudents = students.stream()
                .sorted((s1, s2) -> Integer.compare(s2.getGrade(), s1.getGrade())) // TODO: Sort by highest grade first
                .collect(Collectors.toList());

        List<Student> top3Students = sortedStudents.stream()
                .limit(3) // TODO: Limit to 3
                .collect(Collectors.toList());

//        boolean allAbove80 = top3Students.stream()
//                .allMatch() // TODO: Check if all are above 80
//
//        boolean hasPerfectScore = students.stream()
//                .anyMatch() // TODO: Check if any grade is 100

        System.out.println(students);

    }
}
class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return name + " - " + grade;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return Objects.equals(name, student.name);
    }
}