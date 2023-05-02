package task2;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Car2 {

    //внедрение через конструктор (предпочтительнее)
    private final Engine engine;

    void run() {
        System.out.println(engine.getVersion());
    }
}
