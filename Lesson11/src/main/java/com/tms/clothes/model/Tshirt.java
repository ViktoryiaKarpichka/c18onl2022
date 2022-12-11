package com.tms.clothes.model;

import com.tms.clothes.services.MenClothes;
import com.tms.clothes.services.WomanClothes;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Tshirt extends Clothes implements MenClothes, WomanClothes {

    public Tshirt(int size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.printf("The Man wearing T-shirt size- %d, color - %s cost - %d", getSize(), getColor(), getPrice());
    }


    @Override
    public void dressWoman() {
        System.out.printf("The Woman wearing T-shirt size- %d, color - %s cost - %d", getSize(), getColor(), getPrice());
    }
}
