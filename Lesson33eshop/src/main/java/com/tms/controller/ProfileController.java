package com.tms.controller;

import static com.tms.model.PagesPath.PROFILE_PAGE;
import static com.tms.model.PagesPath.SIGN_IN_PAGE;
import static com.tms.utils.Utils.isUserLogIn;

import com.tms.exeptions.CommandException;
import com.tms.model.PagesPath;
import com.tms.model.User;
import javax.servlet.http.HttpServletRequest;

public class ProfileController implements BaseCommandController {

    @Override
    public PagesPath execute(HttpServletRequest request) throws CommandException {
        User user = (User) request.getSession().getAttribute("username");
        if (isUserLogIn(user)) {
            return PROFILE_PAGE;
        } else {
            return SIGN_IN_PAGE;
        }
    }
}
