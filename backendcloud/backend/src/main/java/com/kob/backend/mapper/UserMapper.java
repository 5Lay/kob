package com.kob.backend.mapper;

import com.kob.backend.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author WuLei
 * @Description
 * @create 2024-06-03-上午8:42
 */

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
