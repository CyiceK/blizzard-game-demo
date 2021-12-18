package com.game.demo.service.impl;

import cn.hutool.crypto.digest.BCrypt;
import com.game.demo.common.security.context.BaseContextHandler;
import com.game.demo.common.security.utils.GenerateJwt;
import com.game.demo.config.BanUser;
import com.game.demo.dto.LoginParams;
import com.game.demo.dto.RegisterParams;
import com.game.demo.dto.UserInfo;
import com.game.demo.entity.User;
import com.game.demo.mapper.UserMapper;
import com.game.demo.service.IUserService;
import com.game.demo.utils.CreateUserNameUtil;
import com.game.demo.utils.api.IErrorCode;
import com.game.demo.utils.api.ResultCode;
import com.game.demo.utils.exception.Asserts;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <p></p>
 *
 * @author: tzy
 * @date: 2021/12/8 19:21
 */

@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserMapper userMapper;

    @Resource
    private CreateUserNameUtil createUserNameUtil;

    @Value("${system.usernamePrefix}")
    private String usernamePrefix;

    @Resource
    private BanUser banUser;

    @Override
    public String register(RegisterParams registerParams) {
        //TODO 前置处理
        if (!registerParams.getCaptcha().equals("1111")){
            Asserts.fail("验证码错误");
        }

        User user = new User();
        user.setName(registerParams.getName());
        user.setEmail(registerParams.getEmail());
        user.setPhone(registerParams.getPhone());
        user.setUsername(createUserNameUtil.get(usernamePrefix));
        user.setPassword(BCrypt.hashpw(registerParams.getPassword(), BCrypt.gensalt(8)));
        user.setEnabled(true);
        user.setIdentityId(registerParams.getIdentityId());
        int impactRow = userMapper.insert(user);
        if (impactRow != 1){
            if (impactRow <= 0){
                Asserts.fail("操作失败 注册未能写入数据库");
            }
            Asserts.fail("操作异常 注册更改了多条数据库记录");
        }
        return "操作成功";
    }

    @Override
    public String login(LoginParams loginParams) {
        //TODO 校验是否为邮箱
        String pattern = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(loginParams.getUsername());

        //TODO 查找用户昵称
        User user = new User();
        if (m.matches()){
            //TODO 输入为邮箱
            user = userMapper.getUserLoginByEmail(loginParams.getUsername());
        }else{
            //TODO 输入为昵称
            user = userMapper.getUserLoginByUsername(loginParams.getUsername());
        }

        //TODO 前置处理
        if (user == null){
            Asserts.fail("账号或密码错误");
        }
        if (!BCrypt.checkpw(loginParams.getPassword(), user.getPassword())){
            Asserts.fail("账号或密码错误");
        }
        if (!user.getEnabled()){
            Asserts.fail("账号被封禁");
        }

        //TODO 返回token
        HashSet<String> roleSet = new HashSet<>();
        roleSet.add("3");
        return GenerateJwt.get(new HashMap<>(), user.getUsername(), roleSet);
    }

    @Override
    public UserInfo getInfo() {
        String userId = BaseContextHandler.getUserId();
        return userMapper.getUserByUsername(userId);
    }

    @Override
    public String logout(String token) {
        return banUser.set(token) == Boolean.TRUE ? "操作成功" : "操作失败";
    }
}
