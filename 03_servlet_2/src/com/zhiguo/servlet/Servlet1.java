package com.zhiguo.servlet;/*
@date 2021/5/17 - 12:30 下午
*/

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //获取请求的参数
        String username = req.getParameter("username");
        System.out.println("在Servlet1中请求查看参数："+ username);

        //将参数传递到Servlet2中
        req.setAttribute("key","Servlet1传递过来的参数");

        //问路：Servlet2怎么走
        /**
         * 请求转发必须要以斜杠打头，/斜杠表示地址为：http://ip:port/工程名/, 映射到IDEA代码的web牡蛎 <br/>
         */

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/servlet2");

        //前往Servlet2
        requestDispatcher.forward(req,resp);
    }
}
