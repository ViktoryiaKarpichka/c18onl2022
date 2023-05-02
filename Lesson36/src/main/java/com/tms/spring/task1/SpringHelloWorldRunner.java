package com.tms.spring.task1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tms.BeanConfig;
import tms.JsonMarshaller;
import tms.User;

public class SpringHelloWorldRunner {

    public static void main(String[] args) throws Exception {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-hello-world.xml")) {
            SpringHelloWorld springHelloWorld = context.getBean("springHelloWorld", SpringHelloWorld.class);
            System.out.println(springHelloWorld.getHelloMessage());
        }

        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class)) {
            JsonMarshaller jsonMarshaller = context.getBean("jsonMarshaller", JsonMarshaller.class);
            String body = jsonMarshaller.marshal(context.getBean("user", User.class));
            System.out.println(body);
            System.out.println(jsonMarshaller.unmarshal(body));
        }
    }
}
