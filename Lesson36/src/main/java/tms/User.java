package tms;

import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@ToString
@Getter
@Component
public class User {

    @Value("${hello.tms}")
    private String name;

}
