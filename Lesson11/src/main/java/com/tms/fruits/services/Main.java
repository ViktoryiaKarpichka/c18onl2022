package com.tms.fruits.services;

import com.tms.fruits.model.Apple;
import com.tms.fruits.model.Apricot;
import com.tms.fruits.model.Fruit;
import com.tms.fruits.model.Pear;

public class Main {
    public static void main(String[] args) {
        Fruit apple = new Apple(1.5, 3);
        Fruit pear = new Pear(1.0, 5);
        Fruit apricot = new Apricot(0.5, 10);
        Fruit[] fruit = {apple, pear, apricot};
        for (Fruit fruits : fruit) {
            fruits.calculateCostOfFruit();
        }
    }
}
