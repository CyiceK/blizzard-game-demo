package com.game.demo.service;

import com.game.demo.dto.LoginParams;
import com.game.demo.dto.RegisterParams;
import com.game.demo.dto.UserInfo;
import com.game.demo.entity.User;

/**
 * <p></p>
 *
 * @author: tzy
 * @date: 2021/12/8 19:18
 */
public interface IUserService {
    public String register(final RegisterParams registerParams);
    public String login(final LoginParams loginParams);
    public UserInfo getInfo();
    public String logout(String token);
}
