package by.tms.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class CarNotStartException extends Exception {
    public CarNotStartException() {
    }

    public CarNotStartException(String message) {
        super(message);
    }
}
