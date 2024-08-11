package model.animal.pack_animal.donkey;

import model.animal.pack_animal.PackAnimal;

import java.time.LocalDate;

public class Donkey extends PackAnimal {
    private int stamina;

    public Donkey(String name, LocalDate birthDate, int stamina) {
        super(name, birthDate);
        this.stamina = stamina;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    @Override
    public void makeSound() {
        System.out.println("Hee-haw! Hee-haw!");
    }

    @Override
    public void carryLoad() {
        System.out.println("The donkey is carrying goods.");
    }
}
