package com.tms.fruits.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Pear extends Fruit {
    private double price;

    public Pear(double weight, double price) {
        super(weight);
        this.price = price;
    }

    public Pear(double weight) {
        super(weight);
    }

    @Override
    double costOfFruit() {
        return getWeight();
    }
}
