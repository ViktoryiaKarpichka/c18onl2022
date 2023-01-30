package com.tms.service;

import com.tms.model.Student;

import static com.tms.utils.CRUDUtils.*;

public class Application {
    public static void main(String[] args) {
        Student student = new Student(6L, "Anton", "Ivanov", 3, 1);
        getAllStudents().forEach(System.out::println);
        saveStudent(student).forEach(System.out::println);
        updateStudent(1, 3).forEach(System.out::println);
        deleteStudent(9).forEach(System.out::println);
        getAllStudentWithCities().forEach(System.out::println);
    }
}
