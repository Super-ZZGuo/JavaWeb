package com.zhiguo.servlet;/*
@date 2021/5/28 - 9:18 下午
*/


import com.google.gson.Gson;

import com.zhiguo.pojo.Person;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AjaxServlet extends BaseServlet{

    protected void javaScriptAjax(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("Ajax请求过来了");

        Person person = new Person(1,"志国");

        //json格式的字符串

        // 创建Gson对象实例
        Gson gson = new Gson();

        String personJsonString = gson.toJson(person);

        resp.getWriter().write(personJsonString);
    }
    protected void jQueryAjax(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("jQueryAjax请求过来了");

        Person person = new Person(1,"志国");

        //json格式的字符串

        // 创建Gson对象实例
        Gson gson = new Gson();

        String personJsonString = gson.toJson(person);

        resp.getWriter().write(personJsonString);
    }
    protected void jQueryGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("jQueryGet方法");

        Person person = new Person(1,"志国");

        //json格式的字符串

        // 创建Gson对象实例
        Gson gson = new Gson();

        String personJsonString = gson.toJson(person);

        resp.getWriter().write(personJsonString);
    }
    protected void jQueryPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("jQueryPost方法");

        Person person = new Person(1,"志国");

        //json格式的字符串

        // 创建Gson对象实例
        Gson gson = new Gson();

        String personJsonString = gson.toJson(person);

        resp.getWriter().write(personJsonString);
    }

    protected void jQueryGetJson(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("jQueryGetJson方法");

        Person person = new Person(1,"志国");

        //json格式的字符串

        // 创建Gson对象实例
        Gson gson = new Gson();

        String personJsonString = gson.toJson(person);

        resp.getWriter().write(personJsonString);
    }
    protected void jQuerySerialize(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("jQuerySerialize方法");

        System.out.println("用户名" + req.getParameter("username"));

        System.out.println("密码" + req.getParameter("password"));

        Person person = new Person(1,"志国");

        //json格式的字符串

        // 创建Gson对象实例
        Gson gson = new Gson();

        String personJsonString = gson.toJson(person);

        resp.getWriter().write(personJsonString);
    }
}