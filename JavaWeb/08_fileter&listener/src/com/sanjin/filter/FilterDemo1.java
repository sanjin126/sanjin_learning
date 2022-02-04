//package com.sanjin.filter;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import java.io.IOException;
//
///**
// * @author sanjin
// * @date 2022/1/30 上午10:41
// * @description
// */
//@WebFilter({"/*","/1"})
//public class FilterDemo1 implements Filter {
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//
//    }
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        System.out.println("FilterDemo1");
//        HttpServletRequest request = (HttpServletRequest) servletRequest;
//        if (request.getRequestURI().contains("/index.jsp") || request.getRequestURI().contains("/ServletDemo2")){
//            filterChain.doFilter(servletRequest, servletResponse);
//
//
//        }
//    }
//
//    @Override
//    public void destroy() {
//
//    }
//}
