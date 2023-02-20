package com.tms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Student {
    private Long id;
    private String surname;
    private String name;
    private Integer course;

    public Student(String surname, String name, Integer course) {
        this.surname = surname;
        this.name = name;
        this.course = course;
    }
}