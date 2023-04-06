package com.tms.controller;

import static com.tms.model.PagesPath.CATEGORY_PAGE;
import static com.tms.model.PagesPath.SIGN_IN_PAGE;
import static com.tms.utils.Utils.isUserLogIn;

import com.tms.model.Category;
import com.tms.model.PagesPath;
import com.tms.model.Product;
import com.tms.model.User;
import com.tms.repository.impl.CategoryRepositoryImpl;
import com.tms.repository.impl.ProductRepositoryImpl;
import com.tms.service.CategoryServiceImpl;
import com.tms.service.ProductService;
import com.tms.service.ProductServiceImpl;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

public class CategoryController implements BaseCommandController {

    private final CategoryServiceImpl categoryService = new CategoryServiceImpl(new CategoryRepositoryImpl());

    private final ProductService productService = new ProductServiceImpl(new ProductRepositoryImpl());

    @Override
    public PagesPath execute(HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("username");
        if (isUserLogIn(user)) {
            List<Category> categories = categoryService.getCategories();
            request.setAttribute("categories", categories);
            int categoryId = Integer.parseInt(request.getParameter("categoryId"));
            //  String nameCategory = request.getParameter("nameCategory");
            List<Product> categoryProducts = productService.getProductsByCategoryId(categoryId);
            request.setAttribute("products", categoryProducts);
            // request.setAttribute("nameCategory", nameCategory);
            return CATEGORY_PAGE;
        } else {
            return SIGN_IN_PAGE;
        }
    }
}
