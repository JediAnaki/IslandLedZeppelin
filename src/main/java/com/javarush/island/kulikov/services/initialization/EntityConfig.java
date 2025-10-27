package com.javarush.island.kulikov.services.initialization;

import com.javarush.island.kulikov.entity.organism.Animal;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
public class EntityConfig {
    // хранит типы животных и их настройки
    private List<Class<? extends Animal>> animalTypes;
    private Map<Class<? extends Animal>, AnimalSettings> animalSettings;

    public List<Class<? extends Animal>> getAllAnimalTypes() {
        return null;
    }

    public AnimalSettings getSettings(Class<? extends Animal> type) {
        return null;
    }

    public Class<? extends Animal> getRandomAnimalType() {
        return null;
    }

}
