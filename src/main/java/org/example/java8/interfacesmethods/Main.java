package org.example.java8.interfacesmethods;

interface Vehicle {
    default void start() {
        System.out.println("Vehicle is starting...");
    }

    static void service() {
        System.out.println("Vehicle service scheduled.");
    }
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start(); // Calls default method
        Vehicle.service();
    }
}
