package com.game.demo.dto;

/**
 * <p></p>
 *
 * @author: tzy
 * @date: 2021/12/12 13:41
 */
public class UserInfo {

    private String name;

    private String email;

    private Long phone;

    private String username;

    private String identityId;

    public UserInfo() {
    }

    public UserInfo(String name, String email, Long phone, String username, String identityId) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.username = username;
        this.identityId = identityId;
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

    public String getIdentityId() {
        return identityId;
    }

    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", username='" + username + '\'' +
                ", identityId='" + identityId + '\'' +
                '}';
    }
}
