package com.tms.task3.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@AllArgsConstructor
@Getter
@Setter
public class MinMax<T extends Number> {
    private T[] array;

    public <T> T minElementOfMassive(T[] array) {
        Arrays.sort(array);
        return array[0];
    }

    public <T> T maxElementOfMassive(T[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    public void printInfo(T[] array) {
        System.out.println(Arrays.toString(array));
    }
}
