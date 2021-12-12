package com.game.demo.common.security.annotion;

import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p></p>
 *
 * @author: tzy
 * @date: 2021/12/9 16:11
 */

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@ResponseBody
public @interface CheckAuthorize {
    //设置类型 用于存放权限信息
    String[] type();

    //判断是否开启此注解，默认开启，主要用于调试阶段
    boolean required() default true;
}