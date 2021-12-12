package com.game.demo.utils;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * <p>生成用户昵称类</p>
 *
 * @author: tzy
 * @date: 2021/12/8 20:18
 */

@Component
public class CreateUserNameUtil {

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    private CreateUserNameUtil(){}

    /**
     * 生成唯一用户昵称
     * @param INSTANCE_NAME 每个服务的唯一编号
     * @return
     */
    public String get(String INSTANCE_NAME) {
        if (null == INSTANCE_NAME) {
            return "The JVM option is null, named 'instance.name'";
        }
        String rs = null;
        Long username_count = redisTemplate.opsForHash().increment("system:params", "username_count", 1);
        rs = INSTANCE_NAME + username_count;
        return rs;
    }
}
