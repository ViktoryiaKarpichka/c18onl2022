package by.tms2.utils;

import lombok.Getter;

@Getter
public enum FlowerType {

    ROSE(15), LILY(7), ASTER(5), HERBERA(5), TULIP(8), CARNATION(11);
    private int cost;

    FlowerType(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

}
