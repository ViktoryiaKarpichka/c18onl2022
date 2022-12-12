package com.tms.clothes.model;

import com.tms.clothes.services.MenClothes;
import com.tms.clothes.services.WomanClothes;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ClothesStudio {
    private Clothes[] clothes;

    public void manDress() {
        for (Clothes clothes1 : clothes) {
            if (clothes1 instanceof MenClothes) {
                ((MenClothes) clothes1).dressMan();
            }
        }
    }

    public void womanDress() {
        for (Clothes clothes1 : clothes) {
            if (clothes1 instanceof WomanClothes) {
                ((WomanClothes) clothes1).dressWoman();
            }
        }
    }

}
