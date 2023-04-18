package com.tms.controller;

import com.tms.utils.Constant;
import com.tms.utils.Utils;
import com.tms.exeptions.CommandException;
import com.tms.model.PagesPath;
import com.tms.model.User;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;

@Controller(Constant.CART_COMMAND)
public class CartController implements BaseCommandController {

    @Override
    public PagesPath execute(HttpServletRequest request) throws CommandException {
        User user = (User) request.getSession().getAttribute("username");
        if (Utils.isUserLogIn(user)) {
            return PagesPath.CART_PAGE;
        } else {
            return PagesPath.SIGN_IN_PAGE;
        }
    }
}
