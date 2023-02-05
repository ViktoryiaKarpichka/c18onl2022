package com.tms.utils;

import com.tms.model.City;
import com.tms.model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CRUDUtils {
    private static final String GET_ALL_STUDENTS_QUERY = "SELECT * FROM students";
    private static final String INSERT_STUDENT_QUERY = "INSERT INTO students(name, surname, course) VALUES(?, ?, ?);";
    private static final String UPDATE_STUDENT_QUERY = "UPDATE students SET course = ? WHERE id = ?;";
    private static final String DELETE_STUDENT_QUERY = "DELETE FROM students WHERE id = ?";
    private static final String GET_ALL_CITY_QUERY = "SELECT * FROM city";
    private static final String INSERT_CITY_QUERY = "INSERT INTO cities (id, name) VALUES (?,?);";
    private static final String DELETE_CITY_QUERY = "DELETE FROM city WHERE id = ?";
    private static final String GET_ALL_STUDENTS_AND_CITIES = "SELECT * FROM students s left join city c on c.id = s.city_id;";


    public static List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        try (Connection connection = DbUtils.getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(GET_ALL_STUDENTS_QUERY);
            while (resultSet.next()) {
                Long id = resultSet.getLong("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                int course = resultSet.getInt("course");
                students.add(new Student(id, name, surname, course));
            }
        } catch (SQLException e) {
            System.out.println("Exception" + e.getMessage());
        }
        return students;
    }

    public static List<City> getAllCity() {
        List<City> cities = new ArrayList<>();
        try (Connection connection = DbUtils.getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(GET_ALL_CITY_QUERY);
            while (resultSet.next()) {
                Long id = resultSet.getLong("id");
                String name = resultSet.getString("name");
                cities.add(new City(id, name));
            }
        } catch (SQLException e) {
            System.out.println("Exception" + e.getMessage());
        }
        return cities;
    }

    public static List<Student> saveStudent(Student student) {
        List<Student> saveStudents = new ArrayList<>();
        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_STUDENT_QUERY);
            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, student.getSurname());
            preparedStatement.setLong(3, student.getCourse());
            preparedStatement.executeUpdate();
            saveStudents = getAllStudents();
        } catch (SQLException e) {
            System.out.println("Exception" + e.getMessage());
        }
        return saveStudents;
    }

    public static List<Student> updateStudent(int studentId, int course) {
        List<Student> updateStudents = new ArrayList<>();
        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_STUDENT_QUERY);
            preparedStatement.setInt(1, course);
            preparedStatement.setInt(2, studentId);
            preparedStatement.executeUpdate();
            updateStudents = getAllStudents();
        } catch (SQLException e) {
            System.out.println("Exception" + e.getMessage());
        }
        return updateStudents;
    }
    public static List<Student> deleteStudent(int studentId) {
        List<Student> updateStudents = new ArrayList<>();
        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_STUDENT_QUERY);
            preparedStatement.setInt(1, studentId);
            preparedStatement.execute();
            updateStudents = getAllStudents();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return updateStudents;
    }

    public static List<City> saveCity(int id, String name) {
        List<City> saveCity = new ArrayList<>();
        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CITY_QUERY);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.executeUpdate();
            saveCity = getAllCity();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return saveCity;
    }

    public static List<City> deleteCity(int id) {
        List<City> updateCity = new ArrayList<>();
        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_CITY_QUERY);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
            updateCity = getAllCity();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return updateCity;
    }

    public static List<Student> getAllStudentWithCities() {
        List<Student> studentsWithCities = new ArrayList<>();
        try (Connection connection = DbUtils.getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(GET_ALL_STUDENTS_AND_CITIES);
            while (resultSet.next()) {
                Long id = resultSet.getLong("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                int course = resultSet.getInt("course");

                // не знаю как достучаться до переменных, т к выводится имя и айди студента
                //или просто в таблице поменять
                Long cityId = resultSet.getLong(6);
                String cityName = resultSet.getString(7);
                studentsWithCities.add(new Student(id, name, surname, course, new City(cityId, cityName)));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return studentsWithCities;
    }
}
