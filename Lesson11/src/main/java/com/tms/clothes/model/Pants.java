package com.tms.clothes.model;

import com.tms.clothes.services.MenClothes;
import com.tms.clothes.services.WomanClothes;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Pants extends Clothes implements MenClothes, WomanClothes {
    public Pants(int size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.printf("The Man wearing pants size- %d, color - %s cost - %d", getSize(), getColor(), getPrice());
    }

    @Override
    public void dressWoman() {
        System.out.printf("The Woman wearing pants size- %d, color - %s cost - %d", getSize(), getColor(), getPrice());
    }
}
