package com.game.demo.common.security.entity;

import com.game.demo.common.security.JwtSecurityConfigDocket;
import com.game.demo.common.security.entity.abst.AbstractUserDetails;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * <p>用户实体类</p>
 *
 * @author: tzy
 * @date: 2021/12/9 16:00
 */

public class UserDetails extends AbstractUserDetails {

    private String userId;

    private List<String> roles;

    private Map<String, Object> params;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "userId='" + userId + '\'' +
                ", roles=" + roles +
                ", params=" + params +
                '}';
    }
}
