package com.tms.task4.utils;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Calculator {
    public static <T extends Number, V extends Number> double sum(T number, V value) {
        return number.doubleValue() + value.doubleValue();
    }

    public static <T extends Number, V extends Number> double multiply(T number, V value) {
        return number.doubleValue() * value.doubleValue();
    }

    public static <T extends Number, V extends Number> Number divide(T number, V value) {
        return number.doubleValue() / value.doubleValue();

    }

    public static <T extends Number, V extends Number> double subtraction(T number, V value) {
        return number.doubleValue() - value.doubleValue();

    }

    //public static <T extends Number, V extends Number> T subtraction(T number, V value) {
    //  Number subtraction = number.doubleValue() - value.doubleValue();
    //return (T) subtraction;
    //}
}
