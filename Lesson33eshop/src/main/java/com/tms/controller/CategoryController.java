package com.tms.controller;

import static com.tms.model.PagesPath.CATEGORY_PAGE;
import static com.tms.model.PagesPath.SIGN_IN_PAGE;
import static com.tms.utils.Utils.isUserLogIn;

import com.tms.exeptions.CommandException;
import com.tms.model.Product;
import com.tms.model.User;
import com.tms.repository.impl.ProductRepositoryImpl;
import com.tms.service.ProductService;
import com.tms.service.ProductServiceImpl;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

public class CategoryController implements BaseCommandController {

    private ProductService productService = new ProductServiceImpl(new ProductRepositoryImpl());

    @Override
    public String execute(HttpServletRequest request) throws CommandException {
        User user = (User) request.getSession().getAttribute("username");
        if (isUserLogIn(user)) {
            int categoryId = Integer.parseInt(request.getParameter("categoryId"));
            String nameCategory = request.getParameter("nameCategory");
            List<Product> categoryProducts = productService.getProductsByCategoryId(categoryId);
            request.setAttribute("products", categoryProducts);
            request.setAttribute("nameCategory", nameCategory);
            return CATEGORY_PAGE.getPath();
        } else {
            return SIGN_IN_PAGE.getPath();
        }
    }
}
