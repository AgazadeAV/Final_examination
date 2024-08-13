package presenter;

import model.service.Service;
import view.View;

import java.time.LocalDate;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view) {
        this.view = view;
        service = new Service();
    }

    public void createCamel(String name, LocalDate birthDate, int numberOfHumps) {
        service.createCamel(name, birthDate, numberOfHumps);
    }

    public void createDonkey(String name, LocalDate birthDate, int stamina) {
        service.createDonkey(name, birthDate, stamina);
    }

    public void createHorse(String name, LocalDate birthDate, int weight) {
        service.createHorse(name, birthDate, weight);
    }

    public void createCat(String name, LocalDate birthDate, String color) {
        service.createCat(name, birthDate, color);
    }

    public void createDog(String name, LocalDate birthDate, String breed) {
        service.createDog(name, birthDate, breed);
    }

    public void createHamster(String name, LocalDate birthDate, int wheelSize) {
        service.createHamster(name, birthDate, wheelSize);
    }

    public void trainAnimal(String name, String command) {
        service.trainAnimal(name, command);
    }

    public void printAnimalCommands(String name) {
        service.printAnimalCommands(name);
    }

    public boolean doesAnimalExist(String name) {
        return service.doesAnimalExist(name);
    }

    public void getAnimalsSortedByBirthdate() {
        service.getAnimalsSortedByBirthdate();
    }

    public void printAllAnimals() {
        service.printAllAnimals();
    }
}
