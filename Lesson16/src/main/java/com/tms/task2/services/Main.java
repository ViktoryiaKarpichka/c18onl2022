package com.tms.task2.services;

import com.tms.task2.model.Cat;
import com.tms.task2.model.ThreeParameters;

public class Main {
    public static void main(String[] args) {
        //2) Обобщенный класс с тремя параметрами
        //* Создать обобщенный класс с тремя параметрами (T, V, K).
        //* Класс содержит три переменные типа (T, V, K), конструктор, принимающий на вход параметры типа (T, V, K),
        //* методы возвращающие значения трех переменных. Создать метод, выводящий на консоль имена классов для трех переменных класса.
        //* Наложить ограничения на параметры типа: T должен реализовать интерфейс Comparable (String),
        //* V должен реализовать интерфейс Serializable и расширять класс Animal, K должен расширять класс Number.
        ThreeParameters<String, Cat, Integer> threeParameters1 = new ThreeParameters<>("Object1", new Cat(), 1);
        threeParameters1.printInfo();
    }
}
