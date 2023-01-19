package com.tms.services;

import com.tms.models.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Task5 {
    public static void main(String[] args) {
        // * 5) Задан список сотрудников, которые хранятся в коллекции List<p3.Person>.
        //     * Объект p3.Person содержит имя и фамилию(по желанию другие данные)
        //     * a) написать метод, который отображает все фамилии, начинающиеся на букву "Д".
        //     * Внимание! Метод должен вернуть объект Optional<String>.
        //     * b*)Со звездочкой. Написать метод, который будет выводить в столбик первую букву фамилии и рядом количество сотрудников,
        //     * у которых фамилия начинается с этой буквы.
        //     * Пример: Антонов, Петров, Сидоров, Александров...
        //     * на экран выведет:
        //     * A - 2 сотрудника
        //     * П - 1 сотрудник
        //     * С - 1 сотрудник
        List<Person> people = new ArrayList<>();
        people.add(new Person("Ivan", "Ivanov"));
        people.add(new Person("Petr", "Petrov"));
        people.add(new Person("Nikolaj", "Sidorov"));
        people.add(new Person("Anna", "Dubrova"));
        people.add(new Person("Nina", "Antonova"));
        System.out.println(getSurnameByStartWithD(people));
        // System.out.println(getCountSurnameByFirstLetter(people));
    }

    public static Optional<String> getSurnameByStartWithD(List<Person> people) {
        return people.stream()
                .map(Person::getSurname)
                .filter(surname -> surname.startsWith("D"))
                .reduce((a, b) -> a + "," + b);
        // .reduce(String::concat);   так красивее,но без запятой выводит
    }
    //здесь вокруг да около
    // public static Map<Character,Integer> getCountSurnameByFirstLetter(List<Person> people) {
    //        Map<Integer, List<String>> map1 = Stream.of(people)
    //                .collect(Collectors.groupingBy(surname->surname.charAt(0),Collectors.counting()));
    //                map1.entrySet().forEach(System.out::println);
    //                       // Collectors.joining(" - ");
    //        return new HashMap<>();
    //    }
}
