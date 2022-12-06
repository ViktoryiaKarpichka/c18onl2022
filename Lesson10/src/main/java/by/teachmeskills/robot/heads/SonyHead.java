package by.teachmeskills.robot.heads;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
public class SonyHead implements IHead {
    private int price;

    @Override
    public void speak() {
        System.out.println("Sony head speaks");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
