package model.animal.pet.dog;

import model.animal.pet.Pet;

import java.time.LocalDate;

public class Dog extends Pet {
    private String breed;

    public Dog(String name, LocalDate birthDate, String breed) {
        super(name, birthDate);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    @Override
    public void play() {
        System.out.println("The dog is playing fetch.");
    }
}
