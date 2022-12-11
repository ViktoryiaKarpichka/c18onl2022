package com.tms.clothes.model;

import com.tms.clothes.services.WomanClothes;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Skirt extends Clothes implements WomanClothes {
    public Skirt(int size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWoman() {
        System.out.printf("The Woman wearing skirt size- %d, color - %s cost - %d", getSize(), getColor(), getPrice());
    }
}
