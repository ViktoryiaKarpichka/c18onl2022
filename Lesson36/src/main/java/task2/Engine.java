package task2;

import org.springframework.stereotype.Component;

@Component
public class Engine {

    private String version = "v2";

    public String getVersion() {
        return version;
    }
}
