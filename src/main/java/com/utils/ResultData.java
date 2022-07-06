package com.utils;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Data
@Component
//泛型形式返回数据给前端方便数据的获取
public class ResultData<T> {

    private Integer code; //编码：1成功，0和其它数字为失败
    private String msg; //错误信息
    private T data; //数据
    private Map map = new HashMap(); //动态数据

    public static <T> ResultData<T> success(T object) {
        ResultData<T> r = new ResultData<T>();
        r.data = object;
        r.code = 1;
        return r;
    }

    public static <T> ResultData<T> success(String msg, Integer code, T object) {
        ResultData<T> r = new ResultData<T>();
        r.data = object;
        r.code = code;
        r.msg = msg;
        return r;
    }

    public static <T> ResultData<T> error(String msg) {
        ResultData r = new ResultData();
        r.msg = msg;
        r.code = 0;
        return r;
    }
}
