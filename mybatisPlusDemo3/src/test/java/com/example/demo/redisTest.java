package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @author maqiang
 * @create 2022-01-18 10:32
 */
@SpringBootTest
public class redisTest {

    @Autowired
    RedisTemplate redisTemplate;

    @Test
    public void test() {
        redisTemplate.opsForValue().set("LA","JAMES");
        System.out.println(redisTemplate.opsForValue().get("LA"));
    }

}
