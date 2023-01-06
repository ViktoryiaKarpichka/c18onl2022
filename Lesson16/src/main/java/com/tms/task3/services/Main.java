package com.tms.task3.services;

import com.tms.task3.model.MinMax;

public class Main {
    public static void main(String[] args) {
        //3)Написать обобщенный класс MinMax, который содержит методы для нахождения минимального и максимального элемента массива.
//        * Массив является переменной класса. Массив должен передаваться в класс через конструктор.
//        * Написать метод принимающий MinMax объект и печатающий информацию об элементах.

        Double[] arrayDouble = {3908.0, 4.06, 5.5};
        Integer[] arrayInt = {2, 4, 9};

        MinMax<?> doubleMinMax = new MinMax<>(arrayDouble);
        MinMax<?> intMinMax = new MinMax<>(arrayInt);

        printMinAndMaxValue(doubleMinMax);
        getInfo(doubleMinMax);
        printMinAndMaxValue(intMinMax);
        getInfo(intMinMax);

        // Long[] arrayLong =new Long[0];
        // MinMax<?> minMaxLong = createMinMax(arrayLong);
    }

    public static void printMinAndMaxValue(MinMax<?> minMax) {
        System.out.println("Минимальный элемент " + minMax.minElementOfMassive() + "\n" + "Максимальный элемент " + minMax.maxElementOfMassive());
    }

    private static void getInfo(MinMax<?> minMax) {
        for (int i = 0; i < minMax.getArray().length; i++) {
            System.out.println("Элемент " + minMax.getArray()[i] + " типа " + minMax.getArray()[i].getClass().getName());
        }
        System.out.println();
    }

    public static <T extends Number> MinMax<T> createMinMax(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("incorrect input parameters");
        }
        return new MinMax<>(array);
    }
}
