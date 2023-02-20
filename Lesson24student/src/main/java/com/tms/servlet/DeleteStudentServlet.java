package com.tms.servlet;

import com.tms.service.StudentService;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete")
public class DeleteStudentServlet extends HttpServlet {

    private StudentService studentService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        studentService = (StudentService) getServletContext().getAttribute("studentService");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Long id = Long.parseLong(request.getParameter("id"));
            studentService.deleteStudent(id);
            response.sendRedirect("/students");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
