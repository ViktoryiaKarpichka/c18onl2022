package com.tms.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        // * 1) Вывести список чисел, умноженных на 2. Список чисел задаем рандомно.
        Random random = new Random();

        List<Long> list = new ArrayList<>();
        list.add(random.nextLong());
        list.add(random.nextLong());
        list.add(random.nextLong());
        list.stream()
                .map(number -> number * 2)
                .forEach(System.out::println);
    }
}
