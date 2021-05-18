package com.zhiguo.servlet;

import com.zhiguo.servlet.BaseServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.http.Cookie;

public class CookieServlet extends BaseServlet {


    protected void creatCookie(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //创建cookie对象
        Cookie  cookie = new Cookie("key","value");

        //通知客户端保存cookie
        response.addCookie(cookie);

        response.getWriter().write("cookie创建成功");


    }
}
