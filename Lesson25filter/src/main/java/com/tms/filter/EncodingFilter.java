package com.tms.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/*")
public class EncodingFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("filter init");
        System.out.println("1");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        if (request.getCharacterEncoding() == null) {
            request.setCharacterEncoding("UTF-8");
        }
        System.out.println("2");
        response.setContentType("text/plain");
        response.setCharacterEncoding("UTF-8");
        chain.doFilter(request, response);

    }

    @Override
    public void destroy() {
        System.out.println(" 3 filter destroy");
    }
}
