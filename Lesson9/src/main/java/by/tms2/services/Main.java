package by.tms2.services;

import by.tms2.model.Flower;
import by.tms2.utils.FlowerType;

public class Main {
    public static void main(String[] args) {
        Flower[] flowers = new Flower[6];
        flowers[0] = new Flower(FlowerType.ROSE.name(), 15);
        flowers[1] = new Flower(FlowerType.LILY.name(), 7);
        flowers[2] = new Flower(FlowerType.ASTER.name(), 5);
        flowers[3] = new Flower(FlowerType.HERBERA.name(), 5);
        flowers[4] = new Flower(FlowerType.TULIP.name(), 8);
        flowers[5] = new Flower(FlowerType.CARNATION.name(), 11);

    }
}
