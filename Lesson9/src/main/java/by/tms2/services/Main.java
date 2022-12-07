package by.tms2.services;

import by.tms2.model.Bouquet;
import by.tms2.model.FlowerMarket;

import static by.tms2.model.Flower.getCount;
import static by.tms2.utils.FlowerType.*;


public class Main {

    public static void main(String[] args) {
        FlowerMarket flowerMarket = new FlowerMarket();
        Bouquet rose = flowerMarket.getBouquet(ROSE, ROSE, ROSE);
        Bouquet aster = flowerMarket.getBouquet(ASTER, ASTER, ASTER);
        Bouquet lily = flowerMarket.getBouquet(LILY, LILY, LILY);
        Bouquet tulip = flowerMarket.getBouquet(TULIP, TULIP, TULIP);
        Bouquet allFlower = flowerMarket.getBouquet(ROSE, LILY, ASTER, TULIP, CARNATION, HERBERA);
        Bouquet[] bouquets = {rose, aster, lily, tulip, allFlower};
        for (Bouquet bouquet : bouquets) {
            System.out.println(bouquet);
            System.out.println(bouquet.getPrice());
        }
        System.out.println("number of flowers sold: " + getCount());
    }
}
