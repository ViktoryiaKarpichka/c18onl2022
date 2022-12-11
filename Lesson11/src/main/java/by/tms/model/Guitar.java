package by.tms.model;

import by.tms.services.Instrument;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Guitar implements Instrument {
    private int numberOfStrings;

    @Override
    public void play() {
        System.out.println("Plays the guitar with a number of strings " + numberOfStrings);
    }
}
