package com.zhiguo.servlet;/*
@date 2021/5/17 - 6:53 下午
*/

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Response1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //设置响应状态码302，表示重定向
        // resp.setStatus(302);

        //设置响应头，说明新的地址在哪
        // resp.setHeader("Location","http://localhost:8080/03_servlet_2/response2");

        resp.sendRedirect("http://localhost:8080/03_servlet_2/response2");
    }
}
