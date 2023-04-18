package com.tms.spring.task1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloWorldRunner {

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-hello-world.xml")) {
            SpringHelloWorld springHelloWorld = context.getBean("springHelloWorld", SpringHelloWorld.class);
            System.out.println(springHelloWorld.getHelloMessage());
        }
    }
}
