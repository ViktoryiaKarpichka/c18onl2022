package com.tms.repository;

import com.tms.model.Student;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcStudentRepository implements StudentRepository {
    private final Connection connection;

    public JdbcStudentRepository(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<Student> findStudents() {
        try {
            System.out.println("4");
            Statement statement = connection.createStatement();
            String sql = "select name,surname,course from students";
            ResultSet rs = statement.executeQuery(sql);
            final List<Student> students = new ArrayList<>();
            while (rs.next()) {
                final Student student = new Student(rs.getString("name"), rs.getString("surname"), rs.getString("course"));
                students.add(student);
            }
            System.out.println("5");
            return students;
        } catch (SQLException e) {
            System.out.println("SQLExeption" + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
