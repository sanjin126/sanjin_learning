package com.sanjin.web;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author sanjin
 * @date 2022/1/19 下午3:39
 * @description
 */
public class Servlet方法 implements Servlet {

    @Override
    /**
     * 在servlet被创建时执行，仅执行一次
     */
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init.....");

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    /**提供服务方法
     * 每一次servlet被访问时，均执行一次
     */
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service.....");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    /**
     * 在servlet被销毁时执行，仅执行一次
     */
    public void destroy() {
        System.out.println("destroy.....");

    }
}
