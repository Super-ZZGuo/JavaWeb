package com.zhiguo.servlet;/*
@date 2021/5/17 - 4:28 下午
*/

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ResponseIOServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //System.out.println(resp.getCharacterEncoding()); //默认ISO-8859-1

        //设置服务器字符集为UTF-8
        // resp.setCharacterEncoding("UTF-8");

        //通过响应头，设置浏览器也使用UTF-8字符集
        // resp.setHeader("Content-Type","text/html;charset=UTF-8");

        //同时设置服务器和客户端为UTF-8字符集，还设置了响应头
        //在获取流对象前调用才有效
        resp.setContentType("text/html;charset=UTF-8");


        //往客户端回传字符流
        PrintWriter writer = resp.getWriter();
        writer.println("response's content!");
        writer.println("国哥真的帅呀！");
    }
}
