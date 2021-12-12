package com.game.demo.common.security.interceptor;

import com.auth0.jwt.exceptions.SignatureVerificationException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.game.demo.common.security.JwtSecurityConfigDocket;
import com.game.demo.common.security.annotion.CheckAuthorize;
import com.game.demo.common.security.context.BaseContextHandler;
import com.game.demo.common.security.entity.UserDetails;
import com.game.demo.common.security.utils.DecodeToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Base64;
import java.util.List;
import java.util.Map;

/**
 * <p></p>
 *
 * @author: tzy
 * @date: 2021/12/9 16:09
 */
public class JwtInterceptor implements HandlerInterceptor {

    private static final Logger log = LoggerFactory.getLogger(JwtInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object object) throws IOException {
        String token = httpServletRequest.getHeader("Authorization");// 从 http 请求头中取出 token
        // 如果不是映射到方法直接通过
        if (!(object instanceof HandlerMethod)) {
            return true;
        }
        HandlerMethod handlerMethod = (HandlerMethod) object;
        Method method = handlerMethod.getMethod();
        //检查是否有CheckAuthorize注释
        if (method.isAnnotationPresent(CheckAuthorize.class)) {
            CheckAuthorize checkAuthorize = method.getAnnotation(CheckAuthorize.class);
            for (String oneType : checkAuthorize.type()) {
                if (!JwtSecurityConfigDocket.getRoleSet().contains(oneType)) {
                    throw new RuntimeException("注解给予的权限与预先设置的权限不相同");
                }
            }
            if (checkAuthorize.required()) {
                //执行认证
                if (token == null || token.equals("")) {
                    String json = "{\"success\":false,\"msg\":\"传递的token为空\"}";
                    httpServletResponse.setStatus(403);
                    httpServletResponse.setCharacterEncoding("utf-8");
                    httpServletResponse.setContentType("application/json; charset=utf-8");
                    httpServletResponse.getWriter().write(json);
                    httpServletResponse.getWriter().flush();
                    httpServletResponse.getWriter().close();
                    log.info("携带空的token，请求已被拦截");
                    return false;
                }
                UserDetails userDetails = new UserDetails();
                try {
                    userDetails = DecodeToken.get(token);
                } catch (TokenExpiredException e){
                    log.info("token过期");
                    String json = "{\"success\":false,\"msg\":\"token已过期\"}";
                    httpServletResponse.setStatus(403);
                    httpServletResponse.setCharacterEncoding("utf-8");
                    httpServletResponse.setContentType("application/json; charset=utf-8");
                    httpServletResponse.getWriter().write(json);
                    httpServletResponse.getWriter().flush();
                    httpServletResponse.getWriter().close();
                    return false;
                } catch (SignatureVerificationException e){
                    log.info("签名不正确");
                    String json = "{\"success\":false,\"msg\":\"签名不正确\"}";
                    httpServletResponse.setStatus(403);
                    httpServletResponse.setCharacterEncoding("utf-8");
                    httpServletResponse.setContentType("application/json; charset=utf-8");
                    httpServletResponse.getWriter().write(json);
                    httpServletResponse.getWriter().flush();
                    httpServletResponse.getWriter().close();
                    return false;
                }
                catch (Exception e) {
                    log.error("操作异常");
                    String json = "{\"success\":false,\"msg\":\"异常错误\"}";
                    httpServletResponse.setStatus(500);
                    httpServletResponse.setCharacterEncoding("utf-8");
                    httpServletResponse.setContentType("application/json; charset=utf-8");
                    httpServletResponse.getWriter().write(json);
                    httpServletResponse.getWriter().flush();
                    httpServletResponse.getWriter().close();
                    e.printStackTrace();
                    return false;
                }
                if (!isEnter(userDetails.getRoles(), checkAuthorize.type())) {
                    log.info("权限不足，访问被拒绝");
                    String json = "{\"success\":false,\"msg\":\"权限不足\"}";
                    httpServletResponse.setStatus(403);
                    httpServletResponse.setCharacterEncoding("utf-8");
                    httpServletResponse.setContentType("application/json; charset=utf-8");
                    httpServletResponse.getWriter().write(json);
                    httpServletResponse.getWriter().flush();
                    httpServletResponse.getWriter().close();
                    return false;
                }
                BaseContextHandler.set("userId", userDetails.getUserId());
                BaseContextHandler.set("roles", userDetails.getRoles());
                BaseContextHandler.set("params", userDetails.getParams());
            }
        }
        return true;
    }


    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        //上下文属性值清除，防止内存泄漏
        BaseContextHandler.remove();
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }

    private static boolean isEnter(List<String> types, String[] needTypes) {
//        List<String> strings = Arrays.asList(types);
        for (String s : needTypes) {
            if (!types.contains(s)) {
                return false;
            }
        }
        return true;
    }
}
