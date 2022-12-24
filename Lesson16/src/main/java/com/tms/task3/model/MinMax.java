package com.tms.task3.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Getter
@Setter
public class MinMax<T extends Number> {
    private T[] array;

    public MinMax(T[] array) throws ArrayIndexOutOfBoundsException {
        this.array = array;
        if (array == null) {
            throw new ArrayIndexOutOfBoundsException("Massive is null");
        }
    }

    public <T> T minElementOfMassive(T[] array) {
        Arrays.sort(array);
        return array[0];
    }

    public <T> T maxElementOfMassive(T[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    public void printInfo() {
        System.out.println(Arrays.toString(array));
    }
}
