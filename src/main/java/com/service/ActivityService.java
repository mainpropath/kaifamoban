package com.service;

import com.bean.Activity;
import com.bean.ActivitySelect;

import java.util.List;

public interface ActivityService {

    List<Activity> selectActivityByActivityAdmin(String userEmail);//根据用户邮箱查询这个用户发布的所有活动

    void increaseTraffic(Integer activityId);//活动访问量+1

    void increaseStar(Integer activityId, String userEmail);//活动点赞量+1

    void reduceStar(Integer activityId, String userEmail);//活动点赞量-1

    List<Activity> selectActivityByDynamicQuery(ActivitySelect activitySelect);//条件查询活动信息

    void insertActivity(Activity activity);//插入活动信息

    void updateActivity(Activity activity);//更改活动信息

    void deleteActivityByActivityId(Integer activityId);//通过活动id删除活动
}
