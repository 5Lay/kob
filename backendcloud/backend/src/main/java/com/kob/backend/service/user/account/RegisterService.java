package com.kob.backend.service.user.account;

import java.util.Map;

/**
 * @author WuLei
 * @Description
 * @create 2024-06-03-下午4:27
 */
public interface RegisterService {
    public Map<String, String> register(String username, String password, String comfirmedPassword);
}
