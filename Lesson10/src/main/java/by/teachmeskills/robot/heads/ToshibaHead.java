package by.teachmeskills.robot.heads;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ToshibaHead implements IHead {
    private int price;

    @Override
    public void speak() {
        System.out.println("Toshiba head speaks");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
