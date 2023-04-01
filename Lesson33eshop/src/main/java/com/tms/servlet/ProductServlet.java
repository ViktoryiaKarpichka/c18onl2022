package com.tms.servlet;

import static com.tms.utils.Utils.isUserLogIn;

import com.tms.model.Product;
import com.tms.model.User;
import com.tms.service.ProductServiceImpl;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/product")
public class ProductServlet extends HttpServlet {

    private ProductServiceImpl productService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        productService = (ProductServiceImpl) config.getServletContext().getAttribute("productService");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = (User) req.getSession().getAttribute("username");
        if (isUserLogIn(user)) {
            List<Product> products = productService.getProducts();
            req.getSession().setAttribute("products", products);
            int productId = Integer.parseInt(req.getParameter("productId"));
            Product product = productService.getProductById(productId);
            req.setAttribute("oneProduct", product);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("product.jsp");
            requestDispatcher.forward(req, resp);
        } else {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/signin.gsp");
            requestDispatcher.forward(req, resp);
        }
    }
}
