package org.example.java8.groupingby;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingStudents {

    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Alice", "A"),
                new Student("Bob", "B"),
                new Student("Charlie", "A"),
                new Student("David", "C"),
                new Student("Eve", "B")
        );

        Map<String, List<Student>> studentsByGrade = students.stream()
                .collect(Collectors.groupingBy(student -> student.grade));

        System.out.println(studentsByGrade);
    }
}
class Student {

    String name;
    String grade;

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
