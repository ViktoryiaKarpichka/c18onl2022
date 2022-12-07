package by.tms2.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FlowerType {

    ROSE(15), LILY(7), ASTER(5), HERBERA(5), TULIP(8), CARNATION(11);

    private int cost;

}
