package com.tms.spring.task2.config;

import com.tms.spring.task2.model.SpringHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:app.properties")
public class SpringHelloWorldConfig {

    @Autowired
    private Environment environment;

    @Bean
    public SpringHello springHello(final String message) {
        return new SpringHello(message);
    }

    @Bean
    public String message() {
        return environment.getProperty("hello.tms");
    }
}
