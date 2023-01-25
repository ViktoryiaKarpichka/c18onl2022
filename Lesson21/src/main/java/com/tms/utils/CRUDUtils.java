package com.tms.utils;

import com.tms.model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CRUDUtils {
    private static final String GET_ALL_STUDENTS_QUERY = "SELECT * FROM students";
    private static final String INSERT_STUDENT_QUERY = "INSERT INTO students(name, surname, course, city) VALUES(?, ?, ?, ?);";
    private static final String UPDATE_STUDENT_QUERY = "UPDATE students SET course = ? WHERE id = ?;";
    private static final String DELETE_STUDENT_QUERY = "DELETE FROM students WHERE id = ?";
    private static final String DELETE_STUDENT_QUERY_BY_CITY = "DELETE FROM students WHERE city = ?";

    public static List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        try (Connection connection = DbUtils.getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(GET_ALL_STUDENTS_QUERY);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                int course = resultSet.getInt("course");
                String city = resultSet.getString("city");
                students.add(new Student(id, name, surname, course, city));
            }
        } catch (SQLException e) {
            System.out.println("Exception" + e.getMessage());
        }
        return students;
    }

    public static List<Student> saveStudent(Student student) {
        List<Student> savedStudents = new ArrayList<>();
        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_STUDENT_QUERY);
            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, student.getSurname());
            preparedStatement.setInt(3, student.getId());
            preparedStatement.setString(4, student.getCity());
            preparedStatement.executeUpdate();
            savedStudents = getAllStudents();
        } catch (SQLException e) {
            System.out.println("Exception" + e.getMessage());
        }
        return savedStudents;
    }

    public static List<Student> updateStudent(int studentId, int course) {
        List<Student> updatedStudents = new ArrayList<>();
        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_STUDENT_QUERY);
            preparedStatement.setInt(1, course);
            preparedStatement.setInt(2, studentId);
            preparedStatement.executeUpdate();
            updatedStudents = getAllStudents();
        } catch (SQLException e) {
            System.out.println("Exception" + e.getMessage());
        }
        return updatedStudents;
    }

    public static List<Student> deleteStudent(int studentId) {
        List<Student> updatedStudents = new ArrayList<>();
        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_STUDENT_QUERY);
            preparedStatement.setInt(1, studentId);
            preparedStatement.execute();
            updatedStudents = getAllStudents();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return updatedStudents;
    }

    public static List<Student> deleteStudentByCity(String city) {
        List<Student> updatedStudents = new ArrayList<>();
        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_STUDENT_QUERY_BY_CITY);
            preparedStatement.setString(1, city);
            preparedStatement.executeUpdate();
            updatedStudents = getAllStudents();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return updatedStudents;
    }
}
