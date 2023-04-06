package com.tms.controller;

import static com.tms.model.PagesPath.PRODUCT_PAGE;
import static com.tms.model.PagesPath.SIGN_IN_PAGE;
import static com.tms.utils.Utils.isUserLogIn;

import com.tms.exeptions.CommandException;
import com.tms.model.PagesPath;
import com.tms.model.Product;
import com.tms.model.User;
import com.tms.repository.impl.ProductRepositoryImpl;
import com.tms.service.ProductServiceImpl;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

public class ProductController implements BaseCommandController {

    private final ProductServiceImpl productService = new ProductServiceImpl(new ProductRepositoryImpl());

    @Override
    public PagesPath execute(HttpServletRequest request) throws CommandException {
        User user = (User) request.getSession().getAttribute("username");
        if (isUserLogIn(user)) {
            List<Product> products = productService.getProducts();
            request.getSession().setAttribute("products", products);
            int productId = Integer.parseInt(request.getParameter("productId"));
            Product product = productService.getProductById(productId);
            request.setAttribute("oneProduct", product);
            return PRODUCT_PAGE;
        } else {
            return SIGN_IN_PAGE;
        }
    }
}
