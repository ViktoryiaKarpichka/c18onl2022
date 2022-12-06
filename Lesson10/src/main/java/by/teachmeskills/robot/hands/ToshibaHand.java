package by.teachmeskills.robot.hands;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ToshibaHand implements IHand {
    private int price;

    @Override
    public void upHand() {
        System.out.println("Toshiba hand up");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
