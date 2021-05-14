package com.zhiguo.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
@date 2021/5/14 - 11:02 上午
*/

public class ContextServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取web.xml中配置上下文的参数context——param
        ServletContext context = getServletConfig().getServletContext();

        String username = context.getInitParameter("username");
        System.out.println("username的名字是："+username);

        //获取当前工程的路径
        System.out.println("当前工程的路径是"+context.getContextPath());

        //获取工程部署后在服务器硬盘上的绝对路径
        /**
         *  /斜杠被服务器解析地址为 http://ip:port/工程名/  映射到idea上的web目录</br>
         */
        System.out.println("工程部署的绝对路径是"+ context.getRealPath("/"));
    }
}
