package by.tms2.model;

import by.tms2.utils.FlowerType;


public class FlowerMarket {


    public Bouquet getBouquet(String... flowers) {
        Flower[] result = new Flower[flowers.length];
        for (int i = 0; i < flowers.length; i++) {
            FlowerType type = FlowerType.valueOf(flowers[i]);
            result[i] = new Flower(type.name(), type.getCost());
        }
        return new Bouquet(result);
    }
}
