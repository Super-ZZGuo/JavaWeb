package com.zhiguo.servlet;

import com.zhiguo.servlet.BaseServlet;
import com.zhiguo.util.CookiesUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.http.Cookie;

public class CookieServlet extends BaseServlet {


    protected void creatCookie(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //创建cookie对象
        Cookie cookie = new Cookie("key", "value");

        //通知客户端保存cookie
        response.addCookie(cookie);

        response.getWriter().write("cookie创建成功");

    }

    protected void getCookie(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //请求获取客户端所有的cookie
        Cookie[] cookies = request.getCookies();

        Cookie cookieIWant = CookiesUtils.findCookies("key", cookies);

//        for(Cookie cookie : cookies){
//            if("key".equals(cookie.getName())){
//                cookieIWant = cookie;
//                break;
//            }
//        }

        if (cookieIWant != null) {
            response.getWriter().write("找到了需要的cookie");
        }
    }

    protected void updateCookie(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //先创建一个要修改的同名的Cookie对象
        //在构造器，同时赋予新的Cookie值
        //Cookie cookie = new Cookie("key", "newValue");

        //调用response.addCookie(cookie);通知 客户端 保存修改
        //response.addCookie(cookie);

        //response.getWriter().write("key的Cookie已经修改好了");

        //先查找到需要修改的Cookie对象
        Cookie cookie = CookiesUtils.findCookies("key", request.getCookies());
        if(cookie != null){
            //调用setvalue()方法赋予新的Cookie值
            cookie.setValue("newValue2");
            //调用response.addCookie(cookie);通知 客户端 保存修改
            response.addCookie(cookie);
            response.getWriter().write("key的Cookie已经修改好了");
        }
    }


    protected void defaultCookie(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        Cookie cookie = new Cookie("defaultCookie","defaultLife");

        cookie.setMaxAge(-1);

        response.addCookie(cookie);
    }

    protected void deleteCookie(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        Cookie cookie = CookiesUtils.findCookies("key",request.getCookies());

        if(cookie != null){
            cookie.setMaxAge(0);//表示马上删除
            response.addCookie(cookie);
        }

        response.getWriter().write("cookie已被删除");
    }

    protected void Cookie3600(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        Cookie cookie = new Cookie("cookie3600","cookieLife3600");

        cookie.setMaxAge(60*60);

        response.addCookie(cookie);

        response.getWriter().write("已经创建一个存活一小时的Cookie");
    }

    protected void CookiePathTest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Cookie cookie = new Cookie("Path", "pathValue");

        //getContextoath() 获取工程路径
        cookie.setPath(request.getContextPath() + "/abc");  //工程路径/abc

        response.addCookie(cookie);

        response.getWriter().write("创建了一个带有path的cookie");




    }
}

