package com.tms.listener;

import com.tms.repository.JdbcStudentRepository;
import com.tms.repository.StudentRepository;
import com.tms.service.StudentService;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@WebListener
public class DependencyInitializationContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(final ServletContextEvent sce) {
        final String dbDriver = "org.postgresql.Driver";
        String username = sce.getServletContext().getInitParameter("db_user");
        String password = sce.getServletContext().getInitParameter("db_password");
        String dbUrl = sce.getServletContext().getInitParameter("db_url");
        try {
            Class.forName(dbDriver);
            Connection connection = DriverManager.getConnection(dbUrl, username, password);
            StudentRepository repository = new JdbcStudentRepository(connection);
            StudentService studentService = new StudentService(repository);
            sce.getServletContext().setAttribute("studentService", studentService);
            sce.getServletContext().setAttribute("connection", connection);
        } catch (Exception e) {
            System.out.println("SQLException" + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        try {
            final Connection connection = (Connection) sce.getServletContext().getAttribute("connection");
            connection.close();
        } catch (SQLException e) {
            System.out.println("Exception" + e.getMessage());
        }
    }
}
