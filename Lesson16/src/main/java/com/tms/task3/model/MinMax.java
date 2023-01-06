package com.tms.task3.model;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.Arrays;

@Getter
@Setter
public class MinMax<T extends Number> {
    private T[] array;

    public MinMax(@NonNull T[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Massive is null");
        } else {
            this.array = array;
        }
    }

    public T minElementOfMassive() {
        Arrays.sort(array);
        return array[0];
    }

    public T maxElementOfMassive() {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    public void printInfo() {
        System.out.println(Arrays.toString(array));
    }

}

