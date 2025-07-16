package org.example.java1224.records;

import java.util.Objects;

public class RecordExample {

    public static void main(String[] args) {
       Person person = new Person("Alice", 25);
        System.out.println(person.getAge());
        System.out.println(person.getName());

        Person1 person1  =new Person1("Alice", -1);
        System.out.println(person1.name());
        System.out.println(person1.age());
        person1.greeting();
    }
}
class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    @Override
    public String toString() { return "Person{name=" + name + ", age=" + age + "}"; }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
record Person1(String name, int age) {

    public Person1 {
        if (age < 0) {
            throw new IllegalArgumentException("Age must not be negative");
        }
    }

    public Person1(String name) {
        this(name, 1);
    }

    void greeting() {
        System.out.println("Hello, " + name);
    }
}