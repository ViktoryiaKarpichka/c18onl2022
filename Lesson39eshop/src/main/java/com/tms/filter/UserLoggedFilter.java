/*package com.tms.filter;

import com.tms.model.PagesPath;
import com.tms.model.User;
import com.tms.utils.Utils;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter(urlPatterns = {"/eshop"})
public class UserLoggedFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        User user = (User) req.getSession().getAttribute("username");
        if (Utils.isUserLogIn(user)) {
            chain.doFilter(request, response);
        } else {
            RequestDispatcher requestDispatcher = req.getServletContext().getRequestDispatcher(PagesPath.SIGN_IN_PAGE.getPath());
            requestDispatcher.forward(request, response);
        }
    }
}*/
