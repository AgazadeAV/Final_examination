package model.animal.pack_animal;

import model.animal.Animal;

import java.time.LocalDate;

public abstract class PackAnimal extends Animal {
    public PackAnimal(String name, LocalDate birthDate) {
        super(name, birthDate);
    }

    public abstract void carryLoad();
}
