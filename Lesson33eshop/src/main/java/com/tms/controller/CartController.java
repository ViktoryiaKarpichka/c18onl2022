package com.tms.controller;

import static com.tms.utils.Utils.isUserLogIn;

import com.tms.exeptions.CommandException;
import com.tms.model.PagesPath;
import com.tms.model.User;
import javax.servlet.http.HttpServletRequest;

public class CartController implements BaseCommandController {

    @Override
    public PagesPath execute(HttpServletRequest request) throws CommandException {
        User user = (User) request.getSession().getAttribute("username");
        if (isUserLogIn(user)) {
            return PagesPath.CART_PAGE;
        } else {
            return PagesPath.SIGN_IN_PAGE;
        }
    }
}
