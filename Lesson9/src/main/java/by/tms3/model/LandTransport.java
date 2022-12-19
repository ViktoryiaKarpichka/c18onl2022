package by.tms3.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@ToString(callSuper = true)
@SuperBuilder
public abstract class LandTransport extends Transport {
    private int wheels;
    private double fuelConsumption;

    public LandTransport() {
        super();
    }
}