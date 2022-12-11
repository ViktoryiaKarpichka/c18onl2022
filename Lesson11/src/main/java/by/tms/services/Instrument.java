package by.tms.services;

public interface Instrument {

    enum Type {
        GUITAR, TRUMPET, DRUM;

        Type() {
        }

    }

    String KEY = "До мажор";

    void play();

}
