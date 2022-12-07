package by.tms.model;

import by.tms.utils.IJacket;
import by.tms.utils.IPants;
import by.tms.utils.IShoes;
import lombok.*;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Person implements IPants, IShoes, IJacket {

    private String name;
    private IShoes shoes;
    private IJacket jacket;
    private IPants pants;


    @Override
    public void putOn() {
        jacket.putOn();
        pants.putOn();
        shoes.putOn();
    }

    @Override
    public void takeOff() {
        jacket.takeOff();
        pants.takeOff();
        shoes.takeOff();
    }
}
