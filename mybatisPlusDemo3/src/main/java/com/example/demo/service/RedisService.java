package com.example.demo.service;

import com.example.demo.entity.RedisInfo;

/**
 * @author maqiang
 * @create 2022-01-21 9:01
 */
public interface RedisService {

    public RedisInfo get(String key);

    public void set(String key, String value);

}
