package com.tms.servlet;

import com.tms.model.Student;
import com.tms.service.StudentService;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddStudentServlet extends HttpServlet {
    //табличка выводится, но добавить студентов не могу понять как
    //создала сервлет,а куда что передавать что-то не приходит в голову
    // и что в фильтрах сделать

    private StudentService studentService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        studentService = (StudentService) config.getServletContext().getAttribute("studentService");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        String course = req.getParameter("course");
        studentService.addStudent(new Student(name, surname, course));
        resp.sendRedirect("/add-student.jsp");
    }
}
