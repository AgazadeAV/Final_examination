package model.animal.pet.cat;

import model.animal.pet.Pet;

import java.time.LocalDate;

public class Cat extends Pet {
    private String color;

    public Cat(String name, LocalDate birthDate, String color) {
        super(name, birthDate);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }

    @Override
    public void play() {
        System.out.println("The cat is chasing a laser pointer.");
    }
}
