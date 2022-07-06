package com.test;

import com.bean.Activity;
import com.mapper.ActivityMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisPlusTest {

    @Autowired
    private ActivityMapper activityMapper;

    @Test
    public void test1() {
        List<Activity> activities = activityMapper.selectAllActivity();
        System.out.println(activities);
    }

}
