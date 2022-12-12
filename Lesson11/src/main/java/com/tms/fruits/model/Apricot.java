package com.tms.fruits.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Apricot extends Fruit {
    public Apricot(double weight, double price) {
        super(weight, price);
    }

    @Override
    public void calculateCostOfFruit() {
        System.out.println(getPrice() * getWeight());
    }
}
