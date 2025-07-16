package org.example.java8.optionals;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        Optional<String> optionalName = Optional.of("John");
        System.out.println(optionalName); // Output: Optional[John]
        if (optionalName.isPresent()) {
            System.out.println(optionalName.get()); // Output: Hello
        }
        optionalName.ifPresent(name -> System.out.println("Value: " + name));

        Optional<String> emptyOptional = Optional.empty();
       System.out.println(emptyOptional.get()); // Exception
        String name = emptyOptional.orElseGet(() -> "Generated Default");
       System.out.println(name); // Output: Generated Default
//
        String name2 = emptyOptional.orElseThrow(() -> new IllegalArgumentException("Value is missing"));

    }

    public String getInsuranceNameWithoutOptional(Person person) {
        if (person != null) {
            Car car = person.getCar();
            if (car != null) {
                Insurance insurance = car.getInsurance();
                if (insurance != null) {
                    return insurance.getName();
                }
            }
        }
        return "Unknown";
    }

    public String getInsuranceNameWithOptional(Person person) {
        return Optional.ofNullable(person)
                .map(Person::getCar)
                .map(Car::getInsurance)
                .map(Insurance::getName)
                .orElse("Unknown") ;
    }
}

class Person {
    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
class Car {
    private Insurance insurance;//could be null

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }
}

class Insurance {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}