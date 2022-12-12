package com.tms.fruits.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Apple extends Fruit {
    public Apple(double weight) {
        super(weight);
    }

    @Override
    double costOfFruit() {
        return 0;
    }
}
