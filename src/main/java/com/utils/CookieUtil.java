package com.utils;

import org.springframework.stereotype.Component;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class CookieUtil {

    /**
     * 创建一个Cookie并初始化
     *
     * @param key   cookie的key值
     * @param value cookie的value值
     * @return 返回创建的Cookie
     */
    public static Cookie creatCookie(String key, String value) {
        Cookie cookie = new Cookie(key, value);
        cookie.setMaxAge(-1);
        cookie.setPath("/");
        return cookie;
    }

    /**
     * 获取特定的cookie
     *
     * @param name    cookie对应的key值
     * @param cookies 传入所有的Cookie集合
     * @return 返回key值为name的cookie
     */
    public static Cookie findCookie(String name, Cookie[] cookies) {
        if (name == null || cookies == null || cookies.length == 0)
            return null;
        for (Cookie cookie : cookies) {
            if (name.equals(cookie.getName())) {
                return cookie;
            }
        }
        return null;
    }

    /**
     * 获取全部的cookie
     *
     * @param req  req
     * @param resp resp
     */
    public static void getCookie(HttpServletRequest req, HttpServletResponse resp) {
        //获取所有的Cookie
        Cookie[] cookies = req.getCookies();
        //遍历输出
        for (Cookie cookie : cookies) {
            System.out.println("Cookie[" + cookie.getName() + "] = " + cookie.getValue());//输出到控制台
        }
    }

    /**
     * cookie的删除
     *
     * @param req  req
     * @param resp resp
     */
    public static void deleteCookie(String key, HttpServletRequest req, HttpServletResponse resp) {
        //创建一个key相同的cookie，时间为0添加进去
        Cookie cookie = new Cookie(key, null);
        //将其时间设置为0
        cookie.setMaxAge(0);
        cookie.setPath("/");
        //然后再将这个Cookie加入进去
        resp.addCookie(cookie);
    }


}
