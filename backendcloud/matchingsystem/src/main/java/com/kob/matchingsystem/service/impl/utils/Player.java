package com.kob.matchingsystem.service.impl.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author WuLei
 * @Description
 * @create 2024-06-07-上午10:40
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Player {
    private Integer useId;
    private Integer rating;
    private Integer botId;
    private Integer waitingTime;    // 等待时间
}
