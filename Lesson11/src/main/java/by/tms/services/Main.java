package by.tms.services;

import by.tms.model.Drum;
import by.tms.model.Guitar;
import by.tms.model.Trumpet;

import static by.tms.services.Instrument.Type.*;

public class Main {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[values().length];
        instruments[0] = createInstrument(GUITAR, 6);
        instruments[1] = createInstrument(DRUM, 30);
        instruments[2] = createInstrument(TRUMPET, 10);
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }

    private static Instrument createInstrument(Instrument.Type iInstrument, int parameter) {
        return switch (iInstrument) {
            case DRUM -> new Drum(parameter);
            case GUITAR -> new Guitar(parameter);
            case TRUMPET -> new Trumpet(parameter);
        };
    }
}