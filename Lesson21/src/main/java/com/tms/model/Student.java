package com.tms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Student {
    private Long id;
    private String name;
    private String surname;
    private int course;
    private int id_city;
    private City city;

    public Student(Long id, String name, String surname, int course, int id_city) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.id_city = id_city;
    }
}
