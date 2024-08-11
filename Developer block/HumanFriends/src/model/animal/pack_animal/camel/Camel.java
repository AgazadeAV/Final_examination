package model.animal.pack_animal.camel;

import model.animal.pack_animal.PackAnimal;

import java.time.LocalDate;

public class Camel extends PackAnimal {
    private int numberOfHumps;

    public Camel(String name, LocalDate birthDate, int numberOfHumps) {
        super(name, birthDate);
        this.numberOfHumps = numberOfHumps;
    }

    public int getNumberOfHumps() {
        return numberOfHumps;
    }

    public void setNumberOfHumps(int numberOfHumps) {
        this.numberOfHumps = numberOfHumps;
    }

    @Override
    public void makeSound() {
        System.out.println("Grrr! Grrr!");
    }

    @Override
    public void carryLoad() {
        System.out.println("The camel is carrying supplies.");
    }
}
