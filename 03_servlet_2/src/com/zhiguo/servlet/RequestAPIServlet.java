package com.zhiguo.servlet;/*
@date 2021/5/14 - 9:42 下午
*/

import com.sun.net.httpserver.HttpServer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RequestAPIServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        getRequestURI() 获取请求的资源路径
        System.out.println("URI->"+req.getRequestURI());
//        getRequestURL() 获取请求的统一资源定位符(绝对路径)
        System.out.println("URL->"+req.getRequestURL());
//        getRemoteHost() 获取客户端的ip地址
        System.out.println("客户端ip地址->"+req.getRemoteHost());
//        getHeader() 获取请求头
        System.out.println("请求头->"+req.getHeader("User-Agent"));
//        getMethod() 获取请求的方式GET或POST
        System.out.println("请求方式->"+req.getMethod());



    }
}
