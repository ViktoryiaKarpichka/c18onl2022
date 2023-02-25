package com.tms.servlet;

import com.tms.model.Product;
import com.tms.service.ProductService;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet
public class ProductServlet extends HttpServlet {
    private ProductService productService;

    // не знаю,как сделать так,чтоб когда нажимаешь на категории переходила на продукты(пока только по всем ссылкам на телефоны переходит - в home.jsp можно как-то вытянуть продукты? )
    //и как сделать так,чтобы header был на всех последующих страницах?надо код переносить во все jsp страницы?
    // или вообще все по-другому надо
    // и еще вопрос:когда хочешь страничку в идее в браузере посмотреть просто код выводит.можно ли с этим что-то сделать?
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        productService = (ProductService) config.getServletContext().getAttribute("productService");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Product> products = productService.createProductsList();
        req.getSession().setAttribute("products", products);
    }
}
