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
            Statement statement = connection.createStatement();
            String sql = "select name from students";
            ResultSet rs = statement.executeQuery(sql);
            final List<Student> students = new ArrayList<>();
            while (rs.next()) {
                final Student student = new Student(rs.getString("name"));
                students.add(student);
            }
            return students;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
