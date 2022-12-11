package com.tms.clothes.model;

import lombok.Getter;

@Getter
public class ClothesStudio {
    private Clothes[] clothes;

    public ClothesStudio(Clothes[] clothes) {
        this.clothes = clothes;
    }


    public void manDress(Clothes[] clothes) {

    }

    public void womanDress(Clothes[] clothes) {

    }

}
