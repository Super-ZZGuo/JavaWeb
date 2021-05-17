package com.zhiguo.servlet;/*
@date 2021/5/17 - 12:31 下午
*/

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //获取请求的参数
        String username = req.getParameter("username");
        System.out.println("在Servlet2中请求查看参数："+ username);

        //查看Servlet1传递过来的参数
        Object key = req.getAttribute("key");
        System.out.println("Servlet1是否传递参数：" + key);

        //Servlet处理自己的业务
        System.out.println("Servlet2处理自己的业务");
    }
}
