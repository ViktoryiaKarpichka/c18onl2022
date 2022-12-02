package by.tms.utils;

import lombok.Getter;

@Getter
public enum Seasons {
    WINTER(-5), SUMMER(15), SPRING(9), AUTUMN(4);
    private final int AverageTemp;

    Seasons(int averageTemp) {
        AverageTemp = averageTemp;
    }
}
