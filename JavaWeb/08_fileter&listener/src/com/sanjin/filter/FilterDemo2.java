package com.sanjin.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * @author sanjin
 * @date 2022/1/30 上午11:17
 * @description
 */
//@WebFilter(value = "/*",dispatcherTypes = {DispatcherType.REQUEST,DispatcherType.FORWARD})
public class FilterDemo2 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("FilterDemo2");
        filterChain.doFilter(servletRequest, servletResponse);

    }

    @Override
    public void destroy() {

    }
}
