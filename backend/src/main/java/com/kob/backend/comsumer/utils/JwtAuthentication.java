package com.kob.backend.comsumer.utils;

import com.kob.backend.utils.JwtUtil;
import io.jsonwebtoken.Claims;

/**
 * @author WuLei
 * @Description
 * @create 2024-06-04-下午10:32
 */
public class JwtAuthentication {
    public static Integer getUserId(String token) {
        Integer userId = -1;
        try {
            Claims claims = JwtUtil.parseJWT(token);
            userId = Integer.parseInt(claims.getSubject());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return userId;
    }
}
