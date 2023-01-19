package com.tms.services;

import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
// * 2) Определение количества четных чисел в потоке данных.
//                * Создаем коллекцию Set<Integer> в которую добавляем рандомно 50 чисел от 0 до 100
//        Stream<Integer> randomStream = Stream.generate(() -> new Random().nextInt(101)).limit(50);
//        System.out.println(randomStream.filter(n -> n % 2 == 0).collect(Collectors.toSet()));


        Random random = new Random();
        Set<Integer> number = random.ints(50, 1, 101)
                .filter(n -> n % 2 == 0)
                .boxed()
                .collect(Collectors.toSet());
        System.out.println(number);

    }
}
