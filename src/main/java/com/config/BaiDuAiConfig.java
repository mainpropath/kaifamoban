package com.config;

import com.baidu.aip.contentcensor.AipContentCensor;

public class BaiDuAiConfig {

    public static final String APP_ID = "26342631";
    public static final String API_KEY = "uBjUgwFT1lD5WPAdGwqsK2B3";
    public static final String SECRET_KEY = "B2pQ1Z00EhyU6RfCsTtjGAjxCUaL9B09";

    /*初始化客户端*/
    public static final AipContentCensor client = new AipContentCensor(APP_ID, API_KEY, SECRET_KEY);


}
