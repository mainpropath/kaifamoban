package com.utils;

import org.apache.commons.mail.HtmlEmail;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class EmailUtil {

    //  BZUXYGUEQVIRZYST   163的授权码
    //  NMLBGBTZYNMMGEHM   126的授权码

    /**
     * 传入邮箱和验证码，发送邮箱验证码。发送成功返回true,发送失败返回false
     *
     * @param emailAddress 邮箱地址
     * @param code         邮箱验证码
     */
    public static boolean sendEmail(String emailAddress, String code) {
        try {
            HtmlEmail email = new HtmlEmail();//不用更改
            email.setHostName("smtp.126.com");//需要修改，126邮箱为smtp.126.com,163邮箱为163.smtp.com，QQ为smtp.qq.com
            email.setCharset("UTF-8");
            email.addTo(emailAddress);// 收件地址
            email.setFrom("aisender@126.com", "动物救助站");//此处填邮箱地址和用户名,用户名可以任意填写
            email.setAuthentication("aisender@126.com", "NMLBGBTZYNMMGEHM");//此处填写邮箱地址和客户端授权码
            email.setSubject("验证码");//此处填写邮件名，邮件名可任意填写
            email.setMsg("尊敬的用户您好,您本次操作的验证码是:" + code + ",验证码时效1分钟，感谢您的支持！");//此处填写邮件内容
            email.send();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 生成6位验证码
     *
     * @return 返回生成的6位验证码
     */
    public static String verificationCode(String base, int len) {
        Random random = new Random();
        StringBuilder code = new StringBuilder();
        for (int i = 0; i < len; i++) {
            int number = random.nextInt(base.length()); //在长度内随机生成数字
            code.append(base.charAt(number));
        }
        return code.toString();
    }

}
