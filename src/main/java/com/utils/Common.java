package com.utils;

//存放各种配置的常量
public class Common {

    public static String VERIFICATION_CODE = "123456789";//邮箱验证码选取范围
    public static int VERIFICATION_CODE_LEN = 6;//邮箱验证码长度
    public static int RANDOM_USERNAME_LEN = 10;//初始随机分配的用户名字符长度
    public static String DEFAULT_USER_IMG_URL = "1.jpg";//默认头像地址
    public static String ARTICLE_IMG_URL = "D:\\ProjectFile\\articleImgs\\";//喵友圈图片路径

    //返回年月日时分秒 格式：2022-05-27 00:10:18.072
    public static String getDateTime() {
        return new java.sql.Timestamp(new java.util.Date().getTime()).toString();
    }

    //返回年月日 格式：2022-05-27
    public static String getDate() {
        return new java.sql.Date(new java.util.Date().getTime()).toString();
    }

    //返回时间 格式：00:10:18
    public static String getTime() {
        return new java.sql.Time(new java.util.Date().getTime()).toString();
    }

}

