package com.tms.services;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Task2 {
    public static void main(String[] args) {
// * 2) Определение количества четных чисел в потоке данных.
//                * Создаем коллекцию Set<Integer> в которую добавляем рандомно 50 чисел от 0 до 100
        Stream<Integer> randomStream = Stream.generate(() -> new Random().nextInt(101)).limit(50);
        System.out.println(randomStream.filter(n -> n % 2 == 0).collect(Collectors.toSet()));

        //было много попыток,одна из низ,но castExrption. Подскажите,как через random.ints сделать, хoчy разобраться
        // Random random = new Random();
        //        Set<Integer> number = new HashSet<>((Collection) random.ints(50, 1, 101));
        //        number.stream()
        //                .filter(n -> n % 2 == 0)
        //                .forEach(System.out::println);

    }
}
