package com.javarush.island.kulikov.entity.map;

import com.javarush.island.kulikov.entity.organizm.animals.Animal;
import lombok.Data;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Data
public class Cell {
    private final int x;
    private final int y;
    private final Map<Class<? extends Animal>, Set<Animal>> animals;
    private int countPlants;

    public void addAnimal(Animal animal) {
        animals.computeIfAbsent(animal.getClass(),
                k -> new HashSet<>()).add(animal);
    }

    public void removeAnimal(Animal animal) {
        Set<Animal> group = animals.get(animal.getClass());
        if (group != null) {
            group.remove(animal);
        }
    }

    public Set<Animal> getAnimalsByType(Class<? extends Animal> type) {
        return animals.getOrDefault(type, Set.of());
    }
}
