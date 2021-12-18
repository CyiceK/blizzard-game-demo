package com.game.demo.config;

import com.game.demo.common.security.annotion.BanUserSign;
import com.game.demo.common.security.ban.AbstractBanUser;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;

/**
 * <p></p>
 *
 * @author: tzy
 * @date: 2021/12/17 20:02
 */

@BanUserSign
public class BanUser implements AbstractBanUser {

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    @Override
    public Boolean set(String token) {
        return redisTemplate.opsForZSet().add("system:blacklist", token, System.currentTimeMillis());
    }

    @Override
    public Boolean get(String token) {
        return redisTemplate.opsForZSet().score("system:blacklist", token) == null ? Boolean.TRUE : Boolean.FALSE;
    }
}
