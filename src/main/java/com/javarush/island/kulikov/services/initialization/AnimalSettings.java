package com.javarush.island.kulikov.services.initialization;

import lombok.Data;

@Data
public class AnimalSettings {
    // параметры конкретного вида
    private double weight;
    private int maxCountPerCell;
    private int speed;
    private double foodNeeded;
}
