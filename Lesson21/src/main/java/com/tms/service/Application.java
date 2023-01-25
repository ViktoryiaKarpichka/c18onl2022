package com.tms.service;

import com.tms.model.Student;
import com.tms.utils.CRUDUtils;

public class Application {
    //наверное, надо 2 таблицы отдельные
    //но пока получилось то,что получилось
    //как лучше набивать студентов,через console или в мэин? (копировала ваш файл,где скрипты)
    public static void main(String[] args) {
        Student student = new Student(7, "Anton", "Ivanov", 3, "Minsk");
        CRUDUtils.getAllStudents().forEach(System.out::println);
        //  CRUDUtils.saveStudent(student).forEach(System.out::println);
        //  CRUDUtils.updateStudent(1, 3).forEach(System.out::println);
        //  CRUDUtils.deleteStudent(2).forEach(System.out::println);
        // CRUDUtils.deleteStudentByCity("Gomel").forEach(System.out::println);
    }
}
