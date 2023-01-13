package com.tms.services;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        //  * 3) Вывести список имен, но с первой заглавной буквой. Список имен: "john", "arya", "sansa"
        List<String> name = Arrays.asList("john", "arya", "sansa");
        name.stream()
                .map(StringUtils::capitalize)
                .forEach(System.out::println);
    }
}
