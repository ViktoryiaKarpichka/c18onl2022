package com.tms.task4.services;

import com.tms.task4.models.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(5, 7));
        calculator.multiply(3, 4);
        //calculator.divide(10,5.0); c double огибка
    }
}
