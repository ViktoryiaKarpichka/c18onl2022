package by.tms.model;

import by.tms.services.Instrument;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Trumpet implements Instrument {
    private int diameter;

    @Override
    public void play() {
        System.out.println("Plays the trumpet with diameter " + diameter);
    }
}
