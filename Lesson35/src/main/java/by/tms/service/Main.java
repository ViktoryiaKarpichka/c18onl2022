package by.tms.service;

import by.tms.model.Age;
import by.tms.model.Product;
import by.tms.model.User;
import by.tms.model.Value;
import java.lang.reflect.Field;
import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        Product tv = Product.of("TV", 1, BigDecimal.ONE);
        System.out.println(tv);

        User user = new User();
        for (Field declaredField : user.getClass().getDeclaredFields()) {
            Value valueAnnotation = declaredField.getAnnotation(Value.class);
            if (valueAnnotation != null) {
                declaredField.setAccessible(true);
                declaredField.set(user, valueAnnotation.value());
            }
        }
        System.out.println(user);
        for (Field declaredField : user.getClass().getDeclaredFields()) {
            Age valueAnnotationCount = declaredField.getAnnotation(Age.class);
            if (valueAnnotationCount != null) {
                declaredField.setAccessible(true);
                declaredField.set(user, valueAnnotationCount.age());
            }
        }
        System.out.println(user);
    }

}
