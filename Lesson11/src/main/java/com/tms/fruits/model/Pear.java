package com.tms.fruits.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Pear extends Fruit {
    public Pear(double weight, double price) {
        super(weight, price);
    }

    @Override
    public double calculateCostOfFruit() {
        return getWeight() * getPrice();
    }

}
