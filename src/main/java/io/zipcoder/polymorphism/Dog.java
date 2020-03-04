package io.zipcoder.polymorphism;

public class Dog extends Pet implements PetType {

    public Dog(String name, PetType type) {
        super(name, type);
    }
}
