package com.tms.task4.services;

import static com.tms.task4.utils.Calculator.*;

public class Main {
    public static void main(String[] args) {
        //4)Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы - sum, multiply, divide,
//        * subtraction. Параметры этих методов - два числа разного типа, над которыми должна быть произведена операция.
        System.out.println(sum(-4, -8));
        System.out.println(multiply(-10, 10));
        System.out.println(subtraction(10, 5));
        System.out.println(divide(-10, -2));
    }
}
