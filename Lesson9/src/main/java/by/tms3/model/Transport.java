package by.tms3.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public abstract class Transport implements Transportable {
    private double power;
    private double maxSpeed;
    private double weight;
    private String brand;

    private double getPower() {
        return power * 0.74;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "power=" + getPower() +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", brand='" + brand + '\'' +
                '}';
    }

    @Override
    public String info() {
        return power + " " + maxSpeed;
    }
}
