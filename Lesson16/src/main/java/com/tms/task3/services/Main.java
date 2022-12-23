package com.tms.task3.services;

import com.tms.task3.model.MinMax;

public class Main {
    public static void main(String[] args) {
        //3)Написать обобщенный класс MinMax, который содержит методы для нахождения минимального и максимального элемента массива.
//        * Массив является переменной класса. Массив должен передаваться в класс через конструктор.
//        * Написать метод принимающий MinMax объект и печатающий информацию об элементах.
        Double[] arrayDouble = new Double[]{1.0, 2.9, 3.0};
        MinMax<Double> doubleArray = new MinMax<>(arrayDouble);

        Integer[] arrayInt = new Integer[]{5, 6, 7};
        MinMax<Integer> intArray = new MinMax<>(arrayInt);

        System.out.println(doubleArray.maxElementOfMassive(arrayDouble));
        doubleArray.printInfo(arrayDouble);

        System.out.println(intArray.minElementOfMassive(arrayInt));
        intArray.printInfo(arrayInt);

    }
}
