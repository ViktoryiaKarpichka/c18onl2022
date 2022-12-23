package com.tms.task4.models;

import static java.lang.Math.divideExact;
import static java.lang.Math.multiplyExact;
//4)Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы - sum, multiply, divide,
//        * subtraction. Параметры этих методов - два числа разного типа, над которыми должна быть произведена операция.

public class Calculator {
    //не понимаю, через return(и что возвращать тогда) или void? С double не работает
    //что-то не то делаю

    public static <T, V> T sum(T number, V value) {
        Integer sum = (Integer) number + (Integer) value;
        return (T) sum;
    }

    public static <T, V> void multiply(T number, V value) {
        System.out.println(multiplyExact((Integer) number, (Integer) value));
    }

    public static <T, V> void divide(T number, V value) {
        divideExact((Integer) number, (Integer) value);
    }

    public static <T, V> void subtraction(T number, V value) {
        Math.subtractExact((Long) number, (Long) value);
    }
}
