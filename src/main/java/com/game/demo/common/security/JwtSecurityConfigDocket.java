package com.game.demo.common.security;

import com.game.demo.common.security.entity.abst.AbstractUserDetails;

import java.util.HashSet;
import java.util.Set;

/**
 * <p>构建jwt实体类</p>
 *
 * @author: tzy
 * @date: 2021/12/9 16:39
 */
public class JwtSecurityConfigDocket {

    private static Set<String> roleSet = new HashSet<>();

    private static Long jwtExpiredTime;

    private static String jwtIssuer;

    private static String jwtSecret;

    private static Boolean logoutEnable;

//    public JwtSecurityConfigDocket userDetails(UserDetails userDetails){
//        this.userDetails = userDetails;
//        return this;
//    }


    public static Set<String> getRoleSet() {
        return roleSet;
    }

    public JwtSecurityConfigDocket setRoleSet(Set<String> roleSet) {
        JwtSecurityConfigDocket.roleSet = roleSet;
        return this;
    }

    public static Long getJwtExpiredTime() {
        return jwtExpiredTime;
    }

    public JwtSecurityConfigDocket setJwtExpiredTime(Long jwtExpiredTime) {
        JwtSecurityConfigDocket.jwtExpiredTime = jwtExpiredTime;
        return this;
    }

    public static String getJwtIssuer() {
        return jwtIssuer;
    }

    public JwtSecurityConfigDocket setJwtIssuer(String jwtIssuer) {
        JwtSecurityConfigDocket.jwtIssuer = jwtIssuer;
        return this;
    }

    public static String getJwtSecret() {
        return jwtSecret;
    }

    public JwtSecurityConfigDocket setJwtSecret(String jwtSecret) {
        JwtSecurityConfigDocket.jwtSecret = jwtSecret;
        return this;
    }

    public static Boolean getLogoutEnable() {
        return logoutEnable;
    }

    public JwtSecurityConfigDocket setLogoutEnable(Boolean status){
        JwtSecurityConfigDocket.logoutEnable = status;
        return this;
    }
}
