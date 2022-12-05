package by.tms2.model;

import lombok.ToString;

@ToString
public class Bouquet {
    private Flower[] flowers;
    public static int count;


    public Bouquet(Flower[] flowers) {
        this.flowers = flowers;
        count++;
    }


    public int getPrice() {
        int price = 0;
        for (int i = 0; i < flowers.length; i++) {
            price += flowers[i].getCost();
        }
        return price;
    }
}
