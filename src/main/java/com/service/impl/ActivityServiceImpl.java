//package com.service.impl;
//
//import com.bean.Activity;
//import com.bean.ActivitySelect;
//import com.mapper.ActivityMapper;
//import com.mapper.StarMapper;
//import com.service.ActivityService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class ActivityServiceImpl implements ActivityService {
//
//
//    @Autowired
//    private ActivityMapper activityMapper;
//
//    @Autowired
//    private StarMapper starMapper;
//
//    /**
//     * 查询这个用户发布的所有活动
//     *
//     * @param userEmail 用户邮箱
//     * @return 发布的所有活动
//     */
//    @Override
//    public List<Activity> selectActivityByActivityAdmin(String userEmail) {
//        return activityMapper.selectActivityByActivityAdmin(userEmail);
//    }
//
//    /**
//     * 删除活动
//     *
//     * @param activityId 活动id
//     */
//    @Override
//    public void deleteActivityByActivityId(Integer activityId) {
//        activityMapper.deleteActivityById(activityId);
//    }
//
//    /**
//     * 增加活动访问量
//     *
//     * @param activityId 活动id
//     */
//    @Override
//    public void increaseTraffic(Integer activityId) {
//        activityMapper.updateActivityVisit(activityId);//活动访问量+1
//    }
//
//    /**
//     * 增加活动点赞量并记录点赞信息
//     *
//     * @param activityId 被点赞的活动id
//     * @param userEmail  用户的邮箱
//     */
//    @Override
//    public void increaseStar(Integer activityId, String userEmail) {
//        activityMapper.updateActivityStar(activityId);//活动表中点赞量+1
//        starMapper.insertStar(activityId, userEmail);//记录点赞信息
//    }
//
//    /**
//     * 减少活动点赞量
//     *
//     * @param activityId 被点赞的活动id
//     * @param userEmail  用户的邮箱
//     */
//    @Override
//    public void reduceStar(Integer activityId, String userEmail) {
//        activityMapper.reduceActivityStar(activityId);//活动表中点赞量-1
//        starMapper.deleteStar(activityId, userEmail);//删除点赞信息
//    }
//
//    /**
//     * 条件查询活动信息
//     *
//     * @param activitySelect 接收查询的条件
//     * @return 返回查询的活动信息
//     */
//    @Override
//    public List<Activity> selectActivityByDynamicQuery(ActivitySelect activitySelect) {
//        return activityMapper.selectActivityByDynamicQuery(activitySelect);
//    }
//
//    /**
//     * 发布活动
//     *
//     * @param activity 活动信息类
//     */
//    @Override
//    public void insertActivity(Activity activity) {
//        activityMapper.insertActivity(activity);
//    }
//
//    /**
//     * 修改活动信息
//     *
//     * @param activity 活动信息类
//     */
//    @Override
//    public void updateActivity(Activity activity) {
//        activityMapper.updateActivity(activity);
//    }
//
//
//}
