package com.tms.servlet;

import com.tms.model.Student;
import com.tms.service.StudentService;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/students")
public class StudentServlet extends HttpServlet {
    private StudentService studentService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("7");
        studentService = (StudentService) config.getServletContext().getAttribute("studentService");
    }

    @Override
    protected void doGet(
            HttpServletRequest req,
            HttpServletResponse resp
    ) throws IOException, ServletException {
        System.out.println("8");
        List<Student> students = studentService.findStudents();
        req.setAttribute("students", students);

        getServletContext().getRequestDispatcher("/students.jsp").forward(req, resp);
    }
}
