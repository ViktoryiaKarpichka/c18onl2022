package com.tms.spring.task2.service;

import com.tms.spring.task2.config.SpringHelloWorldConfig;
import com.tms.spring.task2.model.SpringHello;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringRunner {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringHelloWorldConfig.class)) {
            SpringHello springHello = context.getBean("springHello", SpringHello.class);
            System.out.println(springHello.getHelloMessage());
        }
    }
}
