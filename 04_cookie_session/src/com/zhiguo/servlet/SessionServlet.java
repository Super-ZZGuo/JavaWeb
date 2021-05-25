package com.zhiguo.servlet;/*
@date 2021/5/24 - 7:59 下午
*/

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class SessionServlet extends BaseServlet {

    protected void creatOrGetSession(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建和获取session会话对象
        HttpSession session = req.getSession();

        //判断 当前Session会话，是否为新创建出来的
        boolean aNew = session.isNew();

        //获取Session会话的唯一标识id
        String id = session.getId();

        resp.getWriter().write("得到Session，它的id是：" + id + "<br/>");
        resp.getWriter().write("这个Session是否为新创建的：" + aNew + "<br/>");
    }

    /**
     * 设置Session的值
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void setAttribute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().setAttribute("key1", "value1");

        resp.getWriter().write("已经在Session中保存了数据");
    }

    /**
     * 获取Session的值
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void getAttribute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Object attribute = req.getSession().getAttribute("key1");

        resp.getWriter().write("从Session域中获取的值为" + attribute);
    }

    protected void defaultLife(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //获取Session的默认超时时长
        int maxInactiveInterval = req.getSession().getMaxInactiveInterval();

        resp.getWriter().write("Session的默认超时时长为：" + maxInactiveInterval + "秒");


    }

    protected void life3(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        //先获取Session对象
        HttpSession session = req.getSession();

        //设置当前Session 3秒后超时
        session.setMaxInactiveInterval(3);

        resp.getWriter().write("当前Session已经设置为3秒后销毁");
    }

    protected void deleteNow(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //先获取Session对象
        HttpSession session = req.getSession();

        // 让Session会话马上超时
        session.invalidate();

        resp.getWriter().write("Session已经设置为超时(无效)");

    }
}
