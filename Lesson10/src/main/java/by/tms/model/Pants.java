package by.tms.model;

import by.tms.utils.IPants;
import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class Pants implements IPants {
    @Override
    public void putOn() {
        System.out.println("put on your pants");
    }

    @Override
    public void takeOff() {
        System.out.println("take off your pants");
    }
}
