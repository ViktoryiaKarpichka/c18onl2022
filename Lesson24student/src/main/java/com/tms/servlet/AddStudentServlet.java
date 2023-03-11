package com.tms.servlet;

import com.tms.model.Student;
import com.tms.service.StudentService;
import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class AddStudentServlet extends HttpServlet {

    private StudentService studentService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        studentService = (StudentService) config.getServletContext().getAttribute("studentService");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String name = req.getParameter("name");
            String surname = req.getParameter("surname");
            Integer course = Integer.valueOf(req.getParameter("course"));
            studentService.addStudent(new Student(name, surname, course));
            resp.sendRedirect("/students");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

