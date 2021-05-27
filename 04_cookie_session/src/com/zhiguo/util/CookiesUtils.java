package com.zhiguo.util;/*
@date 2021/5/19 - 4:27 下午
*/

import javax.servlet.http.Cookie;
import java.net.HttpCookie;

public class CookiesUtils  {

    /**
     * 查找指定名称的cookie对象
     */
    public static Cookie findCookies(String name , Cookie[] cookies){

        if(name == null || cookies == null || cookies.length == 0){
            return null;
        }

        for(Cookie cookie : cookies){
            
            if(name.equals(cookie.getName())){
                return cookie;
            }
        }

        return null;

    }
}
