package com.tms.clothes.services;

import com.tms.clothes.model.*;

public class Main {
    public static void main(String[] arg) {
        Clothes[] clothes = new Clothes[4];
        clothes[0] = new Pants(SizeClothes.L.getEuroSize(), 90, "Black");
        clothes[1] = new Skirt(SizeClothes.S.getEuroSize(), 50, "white");
        clothes[2] = new Tshirt(SizeClothes.L.getEuroSize(), 45, "yellow");
        clothes[3] = new Tie(SizeClothes.M.getEuroSize(), 30, "grey");
        ClothesStudio clothesStudio = new ClothesStudio(clothes);


    }
}
