package com.tms.model;

public class HumanArcher implements Archer {

    @Override
    public void act() {
        System.out.println("Human archer shoots with a bow");
    }
}
