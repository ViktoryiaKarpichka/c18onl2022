package com.tms.services;

import com.tms.models.Car;

import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        //  * 4) Создаем класс Car с полями number (номер авто) и year (год выпуска).
        //Необходимо вывести все не пустые номера машин, выпущенных после 2010 года
        List<Car> cars = Arrays.asList(
                new Car("AA1111BX", 2007),
                new Car("AK5555IT", 2010),
                new Car(null, 2012),
                new Car("", 2015),
                new Car("AI3838PP", 2017));
        cars.stream()
                .filter(car -> car.getYear() > 2010 && car.getName() != null && !car.getName().isBlank())
                .forEach(System.out::println);
    }
}
