package com.qfedu.common;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter("/*")
public class CROSFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse resp= (HttpServletResponse) response;
        HttpServletRequest req=(HttpServletRequest)request;
        System.out.println("CROS---拦截");
       /* response.setHeader("Access-Control-Allow-Origin","*");*/
        resp.setHeader("Access-Control-Allow-Origin",req.getHeader("Origin"));
        resp.setHeader("Access-Control-Allow-Methods","GET,POST,PUT,DELETE");
        resp.setHeader("Access-Control-Max-Age","2000");
        resp.setHeader("Access-Control-Allow-Headers","Origin,X-Requested-with,Content-Type,Accept");
        resp.setHeader("Access-Control-Allow-Credentials","true");
        chain.doFilter(request,resp);
    }
    @Override
    public void destroy() {

    }
}
