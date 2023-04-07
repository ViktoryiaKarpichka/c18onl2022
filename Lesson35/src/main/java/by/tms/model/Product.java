package by.tms.model;

import java.math.BigDecimal;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.Value;

@ToString
@Setter
@Getter
@EqualsAndHashCode
@Value(staticConstructor = "of")
public class Product {

    String name;
    int id;
    BigDecimal price;
}
