package by.tms.utils;

import lombok.Getter;

@Getter
public enum Seasons {
    WINTER(-5),
    AUTUMN(4),
    SPRING(9) {
        @Override
        public String getDescription() {
            return "Warm season";
        }
    },
    SUMMER(15) {
        @Override
        public String getDescription() {
            return "Warm season";
        }
    };
    private final int averageTemp;

    Seasons(int averageTemp) {
        this.averageTemp = averageTemp;
    }

    public String getDescription() {
        return "Cold season";
    }
}
