package com.game.demo.controller;

import com.game.demo.common.security.annotion.CheckAuthorize;
import com.game.demo.dto.LoginParams;
import com.game.demo.dto.RegisterParams;
import com.game.demo.dto.UserInfo;
import com.game.demo.entity.User;
import com.game.demo.service.IUserService;
import com.game.demo.utils.api.CommonResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * <p></p>
 *
 * @author: tzy
 * @date: 2021/12/8 19:28
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService iUserService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ApiOperation("注册账号")
    public CommonResult<String> register(HttpServletRequest request, @Validated @RequestBody final RegisterParams registerParams){
        String res = iUserService.register(registerParams);
        return CommonResult.success(res);
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ApiOperation("登录账号")
    public CommonResult<String> login(HttpServletRequest request, @Validated @RequestBody final LoginParams loginParams){
        String res = iUserService.login(loginParams);
        return CommonResult.success(res);
    }

    @CheckAuthorize(type = {"3"})
    @RequestMapping(value = "/get_info", method = RequestMethod.GET)
    @ApiOperation("获取账号信息")
    public CommonResult<UserInfo> getInfo(HttpServletRequest request){
        UserInfo user = iUserService.getInfo();
        return CommonResult.success(user);
    }

    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    @ApiOperation("登出账号")
    public CommonResult<String> logout(HttpServletRequest request){
        String res = iUserService.logout(request.getHeader("Authorization"));
        return CommonResult.success(res);
    }
}
