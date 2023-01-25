package com.tms.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Student {
    private int id;
    private String name;
    private String surname;
    private int course;
    private String city;
}
