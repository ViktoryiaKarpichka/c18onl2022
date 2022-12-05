package by.tms2.services;

import by.tms2.model.Bouquet;
import by.tms2.model.FlowerMarket;

import static by.tms2.model.Bouquet.count;


public class Main {

    public static void main(String[] args) {
        FlowerMarket flowerMarket = new FlowerMarket();
        Bouquet rose = flowerMarket.getBouquet("ROSE", "ROSE", "ROSE");
        Bouquet aster = flowerMarket.getBouquet("ASTER", "ASTER", "ASTER");
        Bouquet lily = flowerMarket.getBouquet("LILY", "LILY", "LILY");
        Bouquet tulip = flowerMarket.getBouquet("TULIP", "TULIP", "TULIP");
        Bouquet allFlower = flowerMarket.getBouquet("ROSE", "LILY", "ASTER", "TULIP", "CARNATION", "HERBERA");
        Bouquet[] bouquet = {rose, aster, lily, tulip, allFlower};
        System.out.println(count);
        System.out.println(rose);
        System.out.println(allFlower.getPrice());

    }
}
