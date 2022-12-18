package by.tms3.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@ToString(callSuper = true)
public abstract class AirTransport extends Transport {
    private double wingspan;
    private double minRunwayLength;

    public String info() {
        return super.info() + wingspan + " " + minRunwayLength;
    }
}