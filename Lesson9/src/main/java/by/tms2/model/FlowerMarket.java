package by.tms2.model;

import by.tms2.utils.FlowerType;

public class FlowerMarket {

    public Bouquet getBouquet(FlowerType... flowers) {
        Flower[] result = new Flower[flowers.length];
        for (int i = 0; i < flowers.length; i++) {
            result[i] = new Flower(flowers[i]);
        }
        return new Bouquet(result);
    }
}
