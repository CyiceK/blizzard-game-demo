package com.game.demo;


import com.game.demo.utils.CreateUserNameUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class DemoApplicationTests {

    @Resource
    private CreateUserNameUtil createUserNameUtil;

    @Test
    void contextLoads() {
        System.out.println(createUserNameUtil.get("战网#"));
    }


}
