package com.tms.listener;

import com.tms.repository.CategoryRepository;
import com.tms.repository.impl.CategoryRepositoryImpl;
import com.tms.repository.impl.JdbcCategoryRepository;
import com.tms.repository.impl.ProductRepositoryImpl;
import com.tms.service.CategoryService;
import com.tms.service.CategoryServiceImpl;
import com.tms.service.ProductService;
import com.tms.service.ProductServiceImpl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class InitializationContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(final ServletContextEvent sce) {
        ProductService productService = new ProductServiceImpl(new ProductRepositoryImpl());
        sce.getServletContext().setAttribute("productService", productService);
        CategoryService categoryService = new CategoryServiceImpl(new CategoryRepositoryImpl());
        sce.getServletContext().setAttribute("categoryService", categoryService);

        CategoryRepository jdbcCategoryRepository = new JdbcCategoryRepository(getConnection(sce));
        CategoryService jdbcCategoryService = new CategoryServiceImpl(jdbcCategoryRepository);
        sce.getServletContext().setAttribute("categoryService", categoryService);
        sce.getServletContext().setAttribute("connection", getConnection(sce));
    }

    private Connection getConnection(ServletContextEvent sce) {
        String username = sce.getServletContext().getInitParameter("db_user");
        String password = sce.getServletContext().getInitParameter("db_password");
        String dbUrl = sce.getServletContext().getInitParameter("db_url");
        String dbDriver = sce.getServletContext().getInitParameter("db_driver");
        try {
            Class.forName(dbDriver);
            return DriverManager.getConnection(dbUrl, username, password);
        } catch (Exception e) {
            System.out.println("Unexpected error " + e.getMessage());
        }
        return null;
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
