package com.tms.repository;

import com.tms.model.Student;

import java.util.List;

public interface StudentRepository {
    List<Student> findStudents();
}
