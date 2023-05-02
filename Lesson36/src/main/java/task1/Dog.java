package task1;

import lombok.Getter;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Getter
@Component
@Lazy// только при явном обращении к компоненту
public class Dog implements Animal {

    private String name = "Dog";

    public Dog() {

        System.out.println("Dog initialized");
    }
}
