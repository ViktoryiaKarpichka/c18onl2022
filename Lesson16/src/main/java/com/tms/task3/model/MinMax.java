package com.tms.task3.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Getter
@Setter
public class MinMax<T extends Number> {
    private T[] array;
    //  public MinMax(final String param) {
    //     if (param==null) throw new NullPointerException("please stop");
    //    if (param.length()==0) throw new IllegalArgumentException("no really, please stop");
    //  }

    //Все подробно объяснили,но у меня не работает исключение в конструкторе
    public MinMax(T[] array) throws MinMaxException {
        if (array == null) { // && array.length==0 тож ничего не дает
            throw new MinMaxException("Massive is null");
        } else {
            this.array = array;
        }
    }

    public <T> T minElementOfMassive(T[] array) {
        if (array.length == 0) {
            try {
                throw new MinMaxException("Length of massive is null");
            } catch (MinMaxException e) {
                System.out.println(e.getMessage());
            }
        } else {
            Arrays.sort(array);
        }
        return array[0];
    }

    public <T> T maxElementOfMassive(T[] array) {
        if (array.length == 0) {
            try {
                throw new MinMaxException("Length of massive is null");
            } catch (MinMaxException e) {
                System.out.println(e.getMessage());
            }
        }
        Arrays.sort(array);
        return array[array.length - 1];
    }

    //  а где вызывать метод??
    public <T> T createMinMax(T[] array) {
        if (array == null) {
            return null;
        }
        return (T) array;
    }

    public void printInfo() {
        System.out.println(Arrays.toString(array));
    }
}
