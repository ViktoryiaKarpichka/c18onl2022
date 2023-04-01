package com.tms.controller;

import static com.tms.model.PagesPath.HOME_PAGE;
import static com.tms.model.PagesPath.SIGN_IN_PAGE;
import static com.tms.model.RequestParams.LOGIN;
import static com.tms.model.RequestParams.PASSWORD;
import static com.tms.utils.HttpRequestParamValidator.validateParamNotNull;
import static com.tms.utils.Utils.ADMIN_LOGIN;
import static com.tms.utils.Utils.ADMIN_PASSWORD;
import static com.tms.utils.Utils.isUserLogIn;

import com.tms.exeptions.ValidationException;
import com.tms.model.Cart;
import com.tms.model.Category;
import com.tms.model.User;
import com.tms.repository.impl.CategoryRepositoryImpl;
import com.tms.service.CategoryServiceImpl;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

public class HomeController implements BaseCommandController {

    private final CategoryServiceImpl categoryService = new CategoryServiceImpl(new CategoryRepositoryImpl());

    @Override
    public String execute(HttpServletRequest request) {
        if (request.getMethod().equalsIgnoreCase("GET")) {
            var user = (User) request.getSession().getAttribute("username");
            return checkReceivedUser(user, request);
        } else {
            String login = request.getParameter("username");
            String pass = request.getParameter("password");
            try {
                validateParamNotNull(login);
                validateParamNotNull(pass);
                User user = new User(ADMIN_LOGIN, ADMIN_PASSWORD);
                Cart cart = new Cart();
                request.getSession().setAttribute("cart", cart);
                request.getSession().setAttribute("username", user);
                return checkReceivedUser(user, request);
            } catch (ValidationException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private String checkReceivedUser(User user, HttpServletRequest request) {
        if (isUserLogIn(user)
                && request.getParameter(LOGIN.getValue()).equalsIgnoreCase(ADMIN_LOGIN)
                && PASSWORD.getValue().equalsIgnoreCase(ADMIN_PASSWORD)) {
            request.getSession().setAttribute(LOGIN.getValue(), user);
            List<Category> categories = categoryService.getCategories();
            request.setAttribute("categories", categories);
            return HOME_PAGE.getPath();
        } else {
            return SIGN_IN_PAGE.getPath();
        }
    }
}
