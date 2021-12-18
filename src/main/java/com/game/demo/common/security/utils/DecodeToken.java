package com.game.demo.common.security.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.InvalidClaimException;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.exceptions.SignatureVerificationException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.game.demo.common.security.JwtSecurityConfigDocket;
import com.game.demo.common.security.entity.UserDetails;

import java.lang.reflect.Field;
import java.util.*;

/**
 * <p>解析jwt参数</p>
 *
 * @author: tzy
 * @date: 2021/12/9 21:07
 */

public class DecodeToken {

    private static final String KEY_USER = "userId";

    private static final String KEY_PARAMS = "params";

    private static final String KEY_ROLES = "roles";

    public static UserDetails get(String token) throws JsonProcessingException, IllegalAccessException {
        //System.out.println(JwtSecurityConfigDocket.getJwtSecret());

        Algorithm algorithm = Algorithm.HMAC256(JwtSecurityConfigDocket.getJwtSecret());

        JWTVerifier verifier = JWT.require(algorithm)
                                  .withIssuer(JwtSecurityConfigDocket.getJwtIssuer())
                                  .build();

        DecodedJWT jwt = verifier.verify(token);

        String payload = jwt.getPayload();
        Map<String, Claim> claims = jwt.getClaims();
        UserDetails userDetails = new UserDetails();
        if (claims.get(KEY_USER) == null){
            throw new RuntimeException("寻找不到用户ID");
        }
        userDetails.setUserId(claims.get(KEY_USER).as(String.class));
        userDetails.setRoles(claims.get(KEY_ROLES) == null ? null : castList(claims.get(KEY_ROLES).as(Object.class), String.class));
        userDetails.setParams(claims.get(KEY_PARAMS) == null ? null :getObjectToMap(claims.get(KEY_PARAMS).as(Object.class)));

        return userDetails;
    }

    public static <T> List<T> castList(Object obj, Class<T> clazz)
    {
        List<T> result = new ArrayList<>();
        if(obj instanceof List<?>)
        {
            for (Object o : (List<?>) obj)
            {
                result.add(clazz.cast(o));
            }
            return result;
        }
        throw new RuntimeException("类型转换异常");
    }

    public static Map<String, Object> getObjectToMap(Object obj) throws IllegalAccessException {
        Map<String, Object> map = new HashMap<>();
        Class<?> clazz = obj.getClass();
        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            String fieldName = field.getName();
            Object value = field.get(obj);
            if (value == null){
                value = "";
            }
            map.put(fieldName, value);
        }
        return map;
    }
}
