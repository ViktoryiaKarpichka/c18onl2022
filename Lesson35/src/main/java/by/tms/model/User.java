package by.tms.model;

import lombok.ToString;

@ToString
public class User {

    @Value(value = "Ivan")
    private String name;
    @Value
    private String surname;
    @Age
    private int age;

}
