package com.tms.task1.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Data {
    private String name;

    public void printInfo() {
        System.out.println("Info: " + getClass() + getName());
    }
}
