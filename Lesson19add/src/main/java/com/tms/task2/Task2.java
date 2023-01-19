package com.tms.task2;

import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        // 2) Создать коллекцию, содержащую объекты HeavyBox.
//        Написать метод, который перебирает элементы коллекции и проверяет вес коробок.
//         Если вес коробки больше 300 гр, коробка перемещается в другую коллекцию.
        List<HeavyBox> heavyBoxes = Arrays.asList(
                new HeavyBox(50),
                new HeavyBox(1000),
                new HeavyBox(310),
                new HeavyBox(450),
                new HeavyBox(100));
        heavyBoxes.stream()
                .filter(heavyBox -> heavyBox.getWeight() > 300)
                .forEach(System.out::println);


    }
}
