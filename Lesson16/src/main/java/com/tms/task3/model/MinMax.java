package com.tms.task3.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Getter
@Setter
public class MinMax<T extends Number> {
    private T[] array;

    public MinMax(T[] array) throws MinMaxException {
        if (array == null || array.length == 0) {
            throw new MinMaxException("Massive is null");
        } else {
            this.array = array;
        }
    }

    public <T> T minElementOfMassive(T[] array) {
        Arrays.sort(array);
        return (T) array[0];
    }

    public <T> T maxElementOfMassive(T[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    public void printInfo() {
        System.out.println(Arrays.toString(array));
    }

    public MinMax createMinMax(T[] array) throws MinMaxException {
        if (array == null || array.length == 0) {
            throw new MinMaxException();
        }
        return new MinMax<T>(array);
    }
}

