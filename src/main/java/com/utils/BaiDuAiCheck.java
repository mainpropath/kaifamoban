package com.utils;

import com.config.BaiDuAiConfig;
import org.json.JSONObject;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public class BaiDuAiCheck {


    /**
     * 图像审核
     *
     * @param file 图片
     * @return 返回检测回传的json数据
     * @throws IOException io异常
     */
    public static JSONObject checkImg(MultipartFile file) throws IOException {
        // 参数为本地图片文件二进制数组
        byte[] files = FileCopyUtils.copyToByteArray(file.getInputStream());
        JSONObject response = BaiDuAiConfig.client.imageCensorUserDefined(files, null);
        System.out.println(response);
        return response;
    }

    /**
     * 文本审核
     *
     * @param text 文本内容
     * @return 返回检测回传的json数据
     */
    public static JSONObject checkText(String text) {
        // 参数为输入文本
        return BaiDuAiConfig.client.textCensorUserDefined(text);
    }


}
