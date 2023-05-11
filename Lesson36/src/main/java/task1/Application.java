package task1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "task1") // м/б над конфигурационным файлом
public class Application {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Application.class);
        User user = ctx.getBean(User.class);
        user.info();
        Dog dog = ctx.getBean(Dog.class);
        System.out.println(dog.getName());
    }
}
