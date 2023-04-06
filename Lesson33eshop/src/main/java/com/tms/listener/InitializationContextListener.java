package com.tms.listener;

import com.tms.repository.CategoryRepository;
import com.tms.repository.impl.CategoryRepositoryImpl;
import com.tms.repository.impl.JdbcCategoryRepository;
import com.tms.repository.impl.ProductRepositoryImpl;
import com.tms.repository.utils.ConnectionPool;
import com.tms.service.CategoryService;
import com.tms.service.CategoryServiceImpl;
import com.tms.service.ProductService;
import com.tms.service.ProductServiceImpl;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class InitializationContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(final ServletContextEvent sce) {
        ConnectionPool connectionPool = ConnectionPool.getInstance();
        sce.getServletContext().setAttribute("ConnectionPool", connectionPool);

        ProductService productService = new ProductServiceImpl(new ProductRepositoryImpl());
        sce.getServletContext().setAttribute("productService", productService);
        CategoryService categoryService = new CategoryServiceImpl(new CategoryRepositoryImpl());
        sce.getServletContext().setAttribute("categoryService", categoryService);

        CategoryRepository jdbcCategoryRepository = new JdbcCategoryRepository(connectionPool);
        CategoryService jdbcCategoryService = new CategoryServiceImpl(jdbcCategoryRepository);
        sce.getServletContext().setAttribute("categoryService", categoryService);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ConnectionPool connectionPool = (ConnectionPool) sce.getServletContext().getAttribute("connectionPool");
        connectionPool.closeAllConnection();
    }
}
