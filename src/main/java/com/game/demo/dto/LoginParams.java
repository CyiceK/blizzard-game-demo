package com.game.demo.dto;

/**
 * <p></p>
 *
 * @author: tzy
 * @date: 2021/12/9 15:19
 */
public class LoginParams {

    private String username;

    private String password;

    public LoginParams() {
    }

    public LoginParams(String username, String password) {
        this.username = username;
        this.password = password;
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

    @Override
    public String toString() {
        return "LoginParams{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
