package com.tms.fruits.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class Fruit {
    private double weight;

    public Fruit(double weight) {
        this.weight = weight;
    }

    abstract double costOfFruit();

    public final void printManufacturerInfo() {
        System.out.print("Made in Belarus");
    }

}
