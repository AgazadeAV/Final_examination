package model.animal.pet.hamster;

import model.animal.pet.Pet;

import java.time.LocalDate;

public class Hamster extends Pet {
    private int wheelSize;

    public Hamster(String name, LocalDate birthDate, int wheelSize) {
        super(name, birthDate);
        this.wheelSize = wheelSize;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }

    @Override
    public void makeSound() {
        System.out.println("Squeak! Squeak!");
    }

    @Override
    public void play() {
        System.out.println("The hamster is running on the wheel.");
    }
}
