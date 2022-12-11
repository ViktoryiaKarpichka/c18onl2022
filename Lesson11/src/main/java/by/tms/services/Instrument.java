package by.tms.services;

import lombok.Getter;

public interface Instrument {
    @Getter
    enum Type {
        GUITAR, TRUMPET, DRUM;
    }

    String KEY = "До мажор";

    void play();

}
