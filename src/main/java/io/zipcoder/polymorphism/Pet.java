package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Pet {
    private Integer numOfPets;
    private String petName;
    PetType petType = null;
    Map<PetType, Integer> myPets = new HashMap<PetType, Integer>();

    public Pet(String name, PetType type){
        this.petName = name;
        this.petType = type;
    }
    public String speak(String noise){
        return noise;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public void addPet(Integer numOfPet, PetType pet){
        myPets.put(pet, numOfPet);
    }
}
