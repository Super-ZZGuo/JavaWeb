package com.zhiguo.servlet;/*
@date 2021/5/4 - 2:50 下午
*/


import javax.servlet.*;
import java.io.IOException;

public class HellowServlet implements Servlet {

    public HellowServlet() {
        System.out.println("执行servlet构造函数");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("执行init初始化方法");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * servlet是专门用来处理请求和响应的
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        System.out.println("执行servlet方法 == Hellow Servlet 被访问了");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("执行destroy销毁方法");

    }
}
