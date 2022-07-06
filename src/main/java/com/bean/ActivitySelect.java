package com.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActivitySelect {
    private String[] activityDate;//活动日期
    private String activityType;//活动性质（线上、线下）
}
