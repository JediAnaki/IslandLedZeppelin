package com.javarush.island.kulikov.entity.organism;

import com.javarush.island.kulikov.entity.map.Cell;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Animal {

    private Double weight;
    private Integer speed;
    private Integer foodNeeded;
    private Integer currentFood;
    private Cell currentCell;

    public abstract void move();
    public abstract void eat();
    public abstract void reproduce();
    public abstract boolean isDead();

}
