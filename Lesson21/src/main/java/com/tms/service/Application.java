package com.tms.service;

import com.tms.model.Student;

import static com.tms.utils.CRUDUtils.getAllStudentWithCities;

public class Application {
    public static void main(String[] args) {
        Student student = new Student(6L, "Anton", "Ivanov", 3);
        getAllStudentWithCities().forEach(System.out::println);
    }
}
