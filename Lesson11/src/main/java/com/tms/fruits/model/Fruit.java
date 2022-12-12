package com.tms.fruits.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class Fruit {
    private double weight;
    private double price;

    public Fruit(double weight, double price) {
        this.weight = weight;
        this.price = price;
    }

    abstract void costOfFruit();

    public final void printManufacturerInfo() {
        System.out.print("Made in Belarus");
    }

}
