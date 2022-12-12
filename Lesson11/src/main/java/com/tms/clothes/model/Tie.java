package com.tms.clothes.model;

import com.tms.clothes.services.MenClothes;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Tie extends Clothes implements MenClothes {
    public Tie(int size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.printf("The Man wearing Tie size- %d, color - %s, cost - %d\n", getSize(), getColor(), getPrice());
    }
}
