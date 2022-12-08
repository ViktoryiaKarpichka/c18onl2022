package by.tms3.shuttle.model;

import by.tms3.shuttle.utils.IStart;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Spaceport {
    private IStart start;

    public void launch() {
        if (start.checkStartSystems()) {
            start.engineStart();
            for (int i = 1; i <= 10; i--) {
                if (i == 1) {
                    start.start();
                }
            }
        } else {
            System.out.println("prestart check failed");
        }
    }
}
