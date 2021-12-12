package com.game.demo;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.game.demo.common.security.JwtSecurityConfigDocket;
import com.game.demo.common.security.entity.UserDetails;
import com.game.demo.common.security.utils.DecodeToken;
import com.game.demo.common.security.utils.GenerateJwt;

import java.util.*;

/**
 * <p></p>
 *
 * @author: tzy
 * @date: 2021/12/10 17:59
 */
public class JWTTest {
    public static void main(String[] args) throws JsonProcessingException, IllegalAccessException {
        Set<String> objects1 = new HashSet<>();
        objects1.add("te");
        new JwtSecurityConfigDocket().setJwtExpiredTime(10000L).setJwtSecret("111111").setJwtIssuer("abc").setRoleSet(objects1);

        HashMap<String, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("123", "123");

        HashSet<Object> objects = new HashSet<>();
        objects.add("aa");

        ArrayList<Object> arrayList = new ArrayList<>(objects);

        /*String q =  JWT.create().withExpiresAt(new Date(System.currentTimeMillis() + 1000))
                .withSubject("123")
                .withClaim("params", objectObjectHashMap)
                .withClaim("userId", "123")
                .withClaim("roles", arrayList)
                .sign(Algorithm.HMAC256(JwtSecurityConfigDocket.getJwtSecret()));*/
        String q = GenerateJwt.get(objectObjectHashMap, "2", objects1);
        System.out.println(q);

        UserDetails userDetails = DecodeToken.get(q);
        System.out.println(userDetails);
    }
}
