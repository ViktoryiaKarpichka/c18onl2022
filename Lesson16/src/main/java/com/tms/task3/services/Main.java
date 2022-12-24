package com.tms.task3.services;

import com.tms.task3.model.ArrayIndexOutOfBoundsException;
import com.tms.task3.model.MinMax;

public class Main {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        //3)Написать обобщенный класс MinMax, который содержит методы для нахождения минимального и максимального элемента массива.
//        * Массив является переменной класса. Массив должен передаваться в класс через конструктор.
//        * Написать метод принимающий MinMax объект и печатающий информацию об элементах.

        try { // не могу разобраться где разместить
            Double[] arrayDouble = new Double[0];
            MinMax<Double> doubleArray = new MinMax<>(arrayDouble);
            System.out.println(doubleArray.minElementOfMassive(arrayDouble));
            doubleArray.printInfo();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        Integer[] arrayInt = new Integer[]{5, 6, 7};
        MinMax<Integer> intArray = new MinMax<>(arrayInt);

        System.out.println(intArray.minElementOfMassive(arrayInt));
        intArray.printInfo();

    }
}
