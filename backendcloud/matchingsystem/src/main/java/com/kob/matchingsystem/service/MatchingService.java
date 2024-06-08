package com.kob.matchingsystem.service;

import org.springframework.stereotype.Service;

/**
 * @author WuLei
 * @Description
 * @create 2024-06-06-下午11:22
 */
public interface MatchingService {
    String addPlayer(Integer userId, Integer rating, Integer botId);
    String removePlayer(Integer userId);
}
