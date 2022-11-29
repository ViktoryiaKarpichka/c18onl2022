package hw2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class GasTank {
    private int fuelTank;
    private int fuelResidue;
    private int fuelConsumption;

    public GasTank(int fuelTank) {
        this.fuelTank = fuelTank;
    }
}
