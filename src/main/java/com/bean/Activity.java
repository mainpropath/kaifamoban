package com.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
//获取活动信息实体类
public class Activity {
    private Integer activityId;//活动id
    private String activityName;//活动名
    private String activityAdmin;//活动管理者账号
    private String activityDate;//活动发布时间
    private String activityStartTime;//活动开始时间
    private String activityPeople;//火哦的那个所需人数
    private String activityType;//活动性质（线上还是线下）
    private String activityContactWay;//活动联系方式
    private String activityDescription;//活动描述
    private String activityAdminName;//活动管理者昵称
    private Integer activityStar;//活动点赞人数
    private Integer activityVisit;//活动被访问次数
    private String activityAddress;//活动地址
    private String activityQW;//活动群（微信群、QQ群）
}
