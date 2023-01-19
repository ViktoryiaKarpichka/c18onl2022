package com.tms.task3;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        //  3) Создайте HashMap, содержащий пары значений - имя игрушки и объект игрушки (класс Toy).
        //        Перебрать и распечатать набор из имен игрушек (keySet).
        //        Перебрать и распечатать значения HashMap (values()).
        //        Перебрать пары значений(entrySet()). Для каждого перебора создать свой метод(параметризованный)
        Map<String, Toy> toys = new HashMap<>();
        toys.put("Bear", new Toy("Teddy"));
        toys.put("Boll", new Toy("Jumper"));
        toys.put("Car", new Toy("Audi"));
        toys.put("Doll", new Toy("Barbie"));

        printKey(toys);
        printValues(toys);
        printEntrySet(toys);

    }

    private static void printEntrySet(Map<String, Toy> toys) {
        System.out.println(toys.entrySet());
    }

    private static void printValues(Map<String, Toy> toys) {
        System.out.println(toys.values());
    }

    private static void printKey(Map<String, Toy> toys) {
        System.out.println(toys.keySet());
    }
    // toys.keySet().stream()
    //              .forEach(System.out::println);
    //      toys.values().stream()
    //              .forEach(System.out::println);
    //      toys.entrySet().stream()
    //              .forEach(System.out::println);
}
