package com.game.demo.common.security.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.game.demo.common.security.JwtSecurityConfigDocket;

import java.util.*;

/**
 * <p></p>
 *
 * @author: tzy
 * @date: 2021/12/9 17:27
 */

public class GenerateJwt {
    public static String get(Map<String, Object> params, String userId, Set<String> roles){
        ArrayList<Object> arrayList = new ArrayList<>(roles);
        return JWT.create().withExpiresAt(new Date(System.currentTimeMillis() + JwtSecurityConfigDocket.getJwtExpiredTime()))
                    .withIssuer(JwtSecurityConfigDocket.getJwtIssuer())
                    .withClaim("params", params)
                    .withClaim("userId", userId)
                    .withClaim("roles", arrayList)
                    .sign(Algorithm.HMAC256(JwtSecurityConfigDocket.getJwtSecret()));
    }
}
