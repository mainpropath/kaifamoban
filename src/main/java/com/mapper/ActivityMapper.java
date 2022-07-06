package com.mapper;


import com.bean.Activity;
import com.bean.ActivitySelect;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ActivityMapper {

    List<Activity> selectAllActivity();//得到所有的活动数据

    List<Activity> selectActivityByActivityAdmin(@Param("activityAdmin") String activityAdmin);//获取这个邮箱的用户发布的所有活动

    Activity selectActivityByActivityId(@Param("id") Integer id);//根据活动id查询活动

    void insertActivity(Activity activity);//增加活动信息

    void deleteActivityById(@Param("id") Integer id);//通过id删除活动

    void updateActivityAdminNickNameByAdmin(@Param("userEmail") String userEmail, @Param("nickName") String nickName);//通过发布活动的邮箱修改昵称

    void updateActivity(Activity activity);//更改活动信息

    void updateActivityStar(@Param("id") Integer id);//活动点赞量+1

    void reduceActivityStar(@Param("id") Integer id);//活动点赞量-1

    void updateActivityVisit(@Param("id") Integer id);//活动访问量+1

    List<Activity> selectActivityByDynamicQuery(ActivitySelect activitySelect);//条件查询获取活动信息
}
