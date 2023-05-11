package task2;

import lombok.Getter;
import org.springframework.stereotype.Component;


@Component
@Getter
public class Car3 {

    // генерим конструктор руками, не через lombok, т к т к есть промежуточная характеристика
    private String model = "Kia Rio X-Line";

    private final Engine engine;

    public Car3(Engine engine) {
        this.engine = engine;
    }
}
