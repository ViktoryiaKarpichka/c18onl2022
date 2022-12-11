package by.tms.services;

import by.tms.model.Drum;
import by.tms.model.Guitar;
import by.tms.model.Trumpet;

public class Main {
    public static void main(String[] args) {

    }

    void createInstrument(Instrument.Type... types) {
        Instrument[] instruments = new Instrument[types.length];
        instruments[0] = new Guitar(7);
        instruments[1] = new Drum(30);
        instruments[2] = new Trumpet(10);
        for (int i = 0; i < types.length; i++) {
            instruments[i] = Instrument.Type[i];
        }
    }
}