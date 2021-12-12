package com.game.demo;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import org.junit.jupiter.api.Assertions;

/**
 * <p></p>
 *
 * @author: tzy
 * @date: 2021/12/11 11:32
 */
public class JavaJwtTest {
    public static void main(String[] args) {
        String token = JWT.create()
                .withAudience("user1") //设置接受方信息，一般时登录用户
                .sign(Algorithm.HMAC256("111111"));  //使用HMAC算法，111111作为密钥加密
        //token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMjMiLCJyb2xlcyI6WyJhYSJdLCJleHAiOjE2MzkxOTM5OTUsInBhcmFtcyI6eyIxMjMiOiIxMjMifSwidXNlcklkIjoiMTIzIn0.OWgekQUesYr51B7n1o8CT5FMsPrGtUQB7x8maGOl5dw";
        //String userId = JWT.decode(token).getAudience().get(0);
        //Assertions.assertEquals("user1", userId);
        JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256("111111")).build();
        jwtVerifier.verify(token);
    }
}
