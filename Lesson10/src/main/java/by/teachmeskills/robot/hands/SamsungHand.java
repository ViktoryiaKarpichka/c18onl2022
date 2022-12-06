package by.teachmeskills.robot.hands;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
public class SamsungHand implements IHand {
    private int price;

    @Override
    public void upHand() {
        System.out.println("Samsung hand up");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
