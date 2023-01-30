package com.tms.utils;

import com.tms.model.City;
import com.tms.model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CRUDUtils {
    private static final String GET_ALL_STUDENTS_QUERY = "SELECT * FROM students";
    private static final String INSERT_STUDENT_QUERY = "INSERT INTO students(name, surname, course, id_city) VALUES(?, ?, ?, ?);";
    private static final String UPDATE_STUDENT_QUERY = "UPDATE students SET course = ? WHERE id = ?;";
    private static final String DELETE_STUDENT_QUERY = "DELETE FROM students WHERE id = ?";
    private static final String GET_ALL_CITY_QUERY = "SELECT * FROM city";
    private static final String INSERT_CITY_QUERY = "INSERT INTO cities (name, id) VALUES (?,?);";
    private static final String DELETE_CITY_QUERY = "DELETE FROM city WHERE id = ?";
    private static final String GET_ALL_STUDENTS_AND_CITIES = "SELECT * FROM students s left join city c on c.id = s.id_city;";


    public static List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        try (Connection connection = DbUtils.getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(GET_ALL_STUDENTS_QUERY);
            while (resultSet.next()) {
                long id = resultSet.getLong("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                int course = resultSet.getInt("course");
                int id_city = resultSet.getInt("id_city");
                students.add(new Student(id, name, surname, course, id_city));
            }
        } catch (SQLException e) {
            System.out.println("Exception" + e.getMessage());
        }
        return students;
    }

    public static List<City> getAllCity() {
        List<City> students = new ArrayList<>();
        try (Connection connection = DbUtils.getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(GET_ALL_CITY_QUERY);
            while (resultSet.next()) {
                long id = resultSet.getLong("id");
                String name = resultSet.getString("name");
                students.add(new City(name, id));
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
            preparedStatement.setLong(3, student.getId());
            preparedStatement.setInt(4, student.getId_city());
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

    public static List<City> saveCity(int id, String name) {
        List<City> savedCity = new ArrayList<>();
        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CITY_QUERY);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            savedCity = getAllCity();
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return savedCity;
    }

    public static List<City> deleteCity(int id) {
        List<City> updatedCity = new ArrayList<>();
        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_CITY_QUERY);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
            updatedCity = getAllCity();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return updatedCity;
    }

    public static List<Student> getAllStudentWithCities() {
        List<Student> studentsWithCities = new ArrayList<>();

        try (Connection connection = DbUtils.getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(GET_ALL_STUDENTS_AND_CITIES);
            while (resultSet.next()) {
                long id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                int course = resultSet.getInt("course");
                int id_city = resultSet.getInt("id_city");
                String nameCity = resultSet.getString("nameCity");
                studentsWithCities.add(new Student(id, name, surname, course, id_city, new City(nameCity)));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return studentsWithCities;
    }
}
