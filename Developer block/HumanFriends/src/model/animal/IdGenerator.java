package model.animal;

import model.animal_registry.AnimalRegistry;

import java.util.concurrent.atomic.AtomicInteger;

public class IdGenerator {
    private final AtomicInteger currentId;

    public IdGenerator(AnimalRegistry animalRegistry) {
        this.currentId = new AtomicInteger(animalRegistry.getMaxId());
    }

    public int generateId() {
        return currentId.incrementAndGet();
    }
}
