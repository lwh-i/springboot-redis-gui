package com.example.demo.controller;

import com.example.demo.entity.RedisInfo;
import com.example.demo.result.Result;
import com.example.demo.result.Results;
import com.example.demo.service.RedisService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author maqiang
 * @create 2022-01-20 17:07
 */
@RestController
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private RedisService redisService;


    @RequestMapping(value = "/choose",method = RequestMethod.POST)
    public Result redisTest(@RequestBody RedisInfo redisInfo) {
        //现在info中只有key和value
        System.out.println("aaaa");
        RedisInfo info = null;
        if(redisInfo.getType().equals("string")) {
            if(redisInfo.getOperation().equals("get")) {
                //key和value已经有了
                info = redisService.get(redisInfo.getKey());
                info.setType(redisInfo.getType());
                info.setOperation(redisInfo.getOperation());
                return Results.success(info);
            } else if( redisInfo.getOperation().equals("set")) {
                redisService.set(redisInfo.getKey(), redisInfo.getValue());
                return Results.success();
            }
        }





    }
}
