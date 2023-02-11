package com.tms.service;

import com.tms.model.Student;
import com.tms.repository.StudentRepository;

import java.util.List;

public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public List<Student> findStudents() {
        System.out.println("6");
        return studentRepository.findStudents();
    }

}
