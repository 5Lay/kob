package com.kob.backend.service.record;

import com.alibaba.fastjson.JSONObject;

/**
 * @author WuLei
 * @Description
 * @create 2024-06-08-下午10:45
 */
public interface GetRecordListService {
    JSONObject getList(Integer page);
}
