package tms;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.tms", "tms"}) //если не указываем, то создаем бины
public class BeanConfig {

/*    @Bean
    public JsonMarshaller jsonMarshaller() {
        return new JsonMarshaller();
    }
    // если объект сторонней библиотеки то можно внедрять этот бин в другие объекты через @Resource или @Autowaried или конструктор + @Component
    //либо можно инициализировать через init() метод жизненного цикла бина (как в примере)
    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper().setSerializationInclusion(Include.NON_NULL)
                                 .configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false)
                                 .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                                 .configure(DeserializationFeature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE, false);
    }

    @Bean
    public User user() {
        return new User();
    }*/
}
