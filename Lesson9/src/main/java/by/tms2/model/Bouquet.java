package by.tms2.model;

import lombok.ToString;

@ToString

public class Bouquet {

    private Flower[] flowers;

    public Bouquet(Flower[] flowers) {
        this.flowers = flowers;
    }

    public int getPrice() {
        int price = 0;
        for (Flower flower : flowers) {
            price += flower.getFlowerType().getCost();
        }
        return price;
    }
}
