package com.tms.repository;

import com.tms.model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcStudentRepository implements StudentRepository {
    private final Connection connection;
    private static final String INSERT_STUDENT_QUERY = "INSERT INTO students(name, surname, course) VALUES(?, ?, ?)";
    private static final String DELETE_STUDENT_QUERY = "DELETE FROM students WHERE id = ?";


    public JdbcStudentRepository(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<Student> findStudents() {
        try {
            Statement statement = connection.createStatement();
            String sql = "select name,surname,course from students";
            ResultSet rs = statement.executeQuery(sql);
            final List<Student> students = new ArrayList<>();
            while (rs.next()) {
                final Student student = new Student(rs.getString("name"), rs.getString("surname"), rs.getInt("course"));
                students.add(student);
            }
            return students;
        } catch (SQLException e) {
            System.out.println("SQLExeption" + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public void addStudent(Student student) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_STUDENT_QUERY);
            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, student.getSurname());
            preparedStatement.setInt(3, student.getCourse());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Exception" + e.getMessage());
        }
    }

    @Override
    public void deleteStudent(Long id) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_STUDENT_QUERY);
            preparedStatement.setLong(1, id);
            preparedStatement.execute();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
