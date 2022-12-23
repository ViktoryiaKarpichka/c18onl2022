package com.tms.task2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class ThreeParameters<T extends String, K extends Animal & Serializable, V extends Number> {
    private T obj1;
    private K obj2;
    private V obj3;

    public void printInfo() {
        System.out.println("obj1: " + getObj1());
        System.out.println("obj2: " + getObj2());
        System.out.println("obj1: " + getObj3());
    }
}
// можно ломбок использовать или генерировать getter, принимающий на вход параметры типа (T, V, K)??
