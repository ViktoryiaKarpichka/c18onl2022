package com.tms.controller;

import com.tms.exeptions.CommandException;
import com.tms.model.PagesPath;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LogoutController implements BaseCommandController {

    @Override
    public PagesPath execute(HttpServletRequest request) throws CommandException {
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.invalidate();
        }
        return PagesPath.SIGN_IN_PAGE;
    }
}
