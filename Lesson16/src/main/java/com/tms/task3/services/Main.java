package com.tms.task3.services;

import com.tms.task3.model.MinMax;
import com.tms.task3.model.MinMaxException;

public class Main {
    public static void main(String[] args) {
        //3)Написать обобщенный класс MinMax, который содержит методы для нахождения минимального и максимального элемента массива.
//        * Массив является переменной класса. Массив должен передаваться в класс через конструктор.
//        * Написать метод принимающий MinMax объект и печатающий информацию об элементах.

        try {
            Double[] arrayDouble = new Double[0];
            MinMax<Double> doubleArray = null;
            doubleArray = new MinMax<>(arrayDouble);
            System.out.println(doubleArray.minElementOfMassive(arrayDouble));
            doubleArray.printInfo();
        } catch (MinMaxException e) {
            System.out.println(e.getMessage());
        }

        Integer[] arrayInt = new Integer[]{2, 4, 9};
        MinMax<Integer> intArray = null;
        try {
            intArray = new MinMax<>(arrayInt);
        } catch (MinMaxException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(intArray.maxElementOfMassive(arrayInt));
        intArray.printInfo();
    }
// а здесь не получается что-то
    //      public static MinMax createMinMax(T[] array) throws MinMaxException {
    //          if(array == null || array.length == 0) {
    //               throw new MinMaxException();
    //           }
    //           return new MinMax(array);
    //   }
}
