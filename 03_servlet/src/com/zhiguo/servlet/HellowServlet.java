package com.zhiguo.servlet;/*
@date 2021/5/4 - 2:50 下午
*/


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class HellowServlet implements Servlet {

    public HellowServlet() {
        System.out.println("执行servlet构造函数");
    }



    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("执行init初始化方法");

//        1.获取servlet-name值
        System.out.println("servlet-name程序的别名是"+ servletConfig.getServletName());
//        2.获取初始化参数init-param
        System.out.println("初始化参数username是" + servletConfig.getInitParameter("username"));
//        3.获取servletcontext对象
        System.out.println(servletConfig.getServletContext());
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

        //类型转换（因为它有getMethod（）方法）
        HttpServletRequest httpServletRequest = (HttpServletRequest)servletRequest;

        //获取请求方式
        String method = httpServletRequest.getMethod();


        if("GET".equals(method)){
            doget();
        }else if("POST".equals(method)){
            dopost();
        }
//        System.out.println("get请求调用");
//        System.out.println("post请求调用");
    }

    /**
     *doget请求
     */
    public void doget(){
        System.out.println("get请求");
    }

    /**
     *dopost请求
     */
    public void dopost(){
        System.out.println("post请求");
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
