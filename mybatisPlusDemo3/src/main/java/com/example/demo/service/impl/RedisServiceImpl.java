package com.example.demo.service.impl;

import com.example.demo.entity.RedisInfo;
import com.example.demo.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @author maqiang
 * @create 2022-01-21 9:18
 */
@Service
public class RedisServiceImpl implements RedisService {

    @Autowired
    private RedisTemplate redisTemplate;


    @Override
    public RedisInfo get(String key) {
        String value = (String) redisTemplate.opsForValue().get(key);
        RedisInfo info = new RedisInfo();
        info.setKey(key);
        info.setValue(value);
        return info;
    }

    @Override
    public void set(String key, String value) {
        redisTemplate.opsForValue().set(key, value);
    }
}
