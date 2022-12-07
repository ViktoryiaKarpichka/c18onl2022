package by.teachmeskills.robot.legs;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SamsungLeg implements ILeg {
    private int price;

    @Override
    public void step() {
        System.out.println("Samsung leg step");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
