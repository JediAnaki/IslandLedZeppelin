package com.javarush.island.kulikov.entity.map;

import lombok.Data;

@Data
public class Island {
    // отдельная клетка, хранит животных и растения
    private final int width;
    private final int height;
    private final Cell[][] cells;
}
