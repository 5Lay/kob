package com.kob.backend.service.ranklist;

import com.alibaba.fastjson.JSONObject;

/**
 * @author WuLei
 * @Description
 * @create 2024-06-09-上午11:32
 */
public interface GetRanklistService {
    JSONObject getList(Integer page);
}
