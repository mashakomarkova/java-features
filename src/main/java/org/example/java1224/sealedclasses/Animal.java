package org.example.java1224.sealedclasses;

public sealed class Animal permits B, Bird, Cat, Dog {}
final class Dog extends Animal {}
non-sealed class Cat extends Animal {}
class Lion extends Cat {}

final class B extends Animal {

}
sealed class Bird extends Animal permits Pigeon {

}
final class Pigeon extends Bird {

}

sealed interface Vehicle permits Bike, Bus, Car, Motorcycle {

}

final class Car implements Vehicle {}
non-sealed class Bike implements Vehicle {}
non-sealed interface Motorcycle extends Vehicle {}
final class Bus implements Vehicle {

}

class Main {

    void printVehicle(Vehicle vehicle) {
        switch (vehicle) {
            case Car c -> System.out.println("It's a car");
            case Bike c -> System.out.println("It's a bike");
            case Motorcycle c -> System.out.println("It's a motorcycle");
            case Bus b -> System.out.println("It's a bus");
        }
    }
}