package by.teachmeskills.robot.heads;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
public class SamsungHead implements IHead {

    private int price;

    @Override
    public void speak() {
        System.out.println("Samsung head speaks");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
