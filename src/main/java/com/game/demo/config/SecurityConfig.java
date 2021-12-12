package com.game.demo.config;

import com.game.demo.common.security.JwtSecurityConfigDocket;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashSet;
import java.util.Set;

/**
 * <p></p>
 *
 * @author: tzy
 * @date: 2021/12/12 11:06
 */

@Configuration
public class SecurityConfig {

    @Bean
    public void createConfig(){
        Set<String> objects1 = new HashSet<>();
        objects1.add("3");
        new JwtSecurityConfigDocket().setJwtExpiredTime(3600000L).setJwtSecret("111111").setJwtIssuer("abc").setRoleSet(objects1);
    }
}
