package com.zhiguo.servlet;/*
@date 2021/5/16 - 9:11 下午
*/

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

public class ParameterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("----------doget------------");

        //获取请求参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String[] hobby = req.getParameterValues("hobby");

        System.out.println("用户名:"+username);
        System.out.println("密码:"+password);
        System.out.println("兴趣爱好:"+ Arrays.asList(hobby));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //post请求设置字符集,解决post请求乱码问题
        req.setCharacterEncoding("UTF-8");
        System.out.println("----------dopost------------");
        //获取请求参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String[] hobby = req.getParameterValues("hobby");

        System.out.println("用户名"+username);
        System.out.println("密码"+password);
        System.out.println("兴趣爱好"+ Arrays.asList(hobby));
    }
}
