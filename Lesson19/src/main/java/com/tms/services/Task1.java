package com.tms.services;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        // * 1) Вывести список чисел, умноженных на 2. Список чисел задаем рандомно.
        Random random = new Random();
        random.ints(5)
                .map(number -> number * 2)
                .forEach(System.out::println);
    }
}
