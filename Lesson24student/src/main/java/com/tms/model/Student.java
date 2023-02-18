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
    private String course;

    public Student(String surname, String name, String course) {
        this.surname = surname;
        this.name = name;
        this.course = course;
    }
}