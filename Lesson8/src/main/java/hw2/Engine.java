package hw2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }
}
