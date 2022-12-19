package by.tms3.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@ToString(callSuper = true)
@SuperBuilder
public class Civil extends AirTransport {
    private int countPassengers;
    private boolean businessClass;

    public void checkPassengerCapacity(int people) {
        if (people <= countPassengers) {
            System.out.println("Самолёт загружен");
        } else {
            System.out.println("Вам нужен самолёт побольше");
        }
    }
}