package by.tms2.model;

import by.tms2.utils.FlowerType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Flower {
    public static int count;
    private FlowerType flowerType;

    public Flower(FlowerType flowerType) {
        this.flowerType = flowerType;
        count++;
    }

    public static int getCount() {
        return count;
    }
}
