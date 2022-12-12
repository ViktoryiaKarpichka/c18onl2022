package com.tms.fruits.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Apple extends Fruit {
    public Apple(double weight, double price) {
        super(weight, price);
    }

    @Override
    public void calculateCostOfFruit() {
        System.out.println(getWeight() * getPrice());
    }
}
