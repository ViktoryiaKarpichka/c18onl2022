package com.tms.task4.utils;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Calculator {
    //?????
    public static <T extends Number, V extends Number> T sum(T number, V value) {
        Number sum = number.doubleValue() + value.doubleValue();
        return (T) sum;
    }

    public static <T extends Number, V extends Number> T multiply(T number, V value) {
        Number multiply = number.doubleValue() * number.doubleValue();
        return (T) multiply;
    }

    public static <T extends Number, V extends Number> T divide(T number, V value) {
        Number divide = number.doubleValue() / number.doubleValue();
        return (T) divide;
    }

    public static <T extends Number, V extends Number> T subtraction(T number, V value) {
        Number subtraction = number.doubleValue() - number.doubleValue();
        return (T) subtraction;
    }
}
