package com.game.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

/**
 * <p></p>
 *
 * @author: tzy
 * @date: 2021/12/8 18:26
 */
public class User implements Serializable {

    private static final long serialVersionUID = 185452103658L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String name;

    private String email;

    private Long phone;

    private String username;

    private String password;

    private String identityId;

    private Boolean enabled;

    public User() {
    }

    public User(Integer id, String name, String email, Long phone, String username, String password, String identityId, Boolean enabled) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.username = username;
        this.password = password;
        this.identityId = identityId;
        this.enabled = enabled;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdentityId() {
        return identityId;
    }

    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", identityId='" + identityId + '\'' +
                ", enabled=" + enabled +
                '}';
    }
}
