package by.tms.model;

import by.tms.utils.IShoes;
import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class Shoes implements IShoes {
    @Override
    public void putOn() {
        System.out.println("put on shoes");
    }

    @Override
    public void takeOff() {
        System.out.println("take off shoes");
    }
}
