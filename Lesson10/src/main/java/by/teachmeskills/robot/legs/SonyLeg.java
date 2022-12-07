package by.teachmeskills.robot.legs;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SonyLeg implements ILeg {
    private int price;

    @Override
    public void step() {
        System.out.println("Sony leg step");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
