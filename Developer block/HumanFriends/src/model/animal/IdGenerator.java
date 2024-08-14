package model.animal;

import model.animal_registry.AnimalRegistry;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

public class IdGenerator implements Serializable {
    private final AtomicInteger currentId;

    public IdGenerator(AnimalRegistry animalRegistry) {
        this.currentId = new AtomicInteger(animalRegistry.getMaxId());
    }

    public int generateId() {
        return currentId.incrementAndGet();
    }
}
