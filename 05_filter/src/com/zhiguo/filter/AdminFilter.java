package com.zhiguo.filter;/*
@date 2021/5/27 - 3:11 下午
*/



import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class AdminFilter implements Filter{


    public AdminFilter() {

    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        //获取Filter的名称filter-name的内容
        System.out.println("filter-name的值是:" + filterConfig.getFilterName());

        //获取在web.xml中配置的init-param初始化参数
        System.out.println("初始化参数上username的值是:" + filterConfig.getInitParameter("username"));
        System.out.println("初始化参数url的值是:" + filterConfig.getInitParameter("url"));

        //获取ServletContext对象
        System.out.println(filterConfig.getServletContext());

    }

    /**
     * doFilter方法，专门用于拦截请求。可以做权限检查。
     * @param servletRequest
     * @param servletResponse
     * @param filterChain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        //类型强制转换
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;

        HttpSession session = httpServletRequest.getSession();
        Object user = session.getAttribute("user");
        //如果等于null，说明还没有登录
        if(user == null){
            servletRequest.getRequestDispatcher("/login.jsp").forward(servletRequest,servletResponse);
            return;
        }else{
            //让程序继续往下访问用户的目标资源
            filterChain.doFilter(servletRequest,servletResponse);
        }

    }

    @Override
    public void destroy() {

    }


}
