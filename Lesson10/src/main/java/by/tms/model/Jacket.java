package by.tms.model;

import by.tms.utils.IJacket;
import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class Jacket implements IJacket {

    @Override
    public void putOn() {
        System.out.println("put on a jacket");
    }

    @Override
    public void takeOff() {
        System.out.println("take off a jacket");
    }
}
