package com.tms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Student {

    private String surname;
    private String name;
    private String course;

    public Student(String name) {
        this.name = name;
    }
}