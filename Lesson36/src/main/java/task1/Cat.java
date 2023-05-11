package task1;

import lombok.Getter;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Getter
@Primary //создает по умолчанию если не совпадают названия бина и класса
//если нужна другая реализация, то явно указываем @Qualifier там гле нужно
@Component
public class Cat implements Animal {

    private String name = "Cat";

}
