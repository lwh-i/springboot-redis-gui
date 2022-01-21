package com.example.demo.vo;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;

/**
 * @author maqiang
 * @create 2022-01-21 9:10
 */
@Data
@ApiModel(value="Redis对象", description="")
public class RedisVo implements Serializable {
    //类型
    private String type;
    //操作
    private String operation;
    //键
    private String key;
    //值
    private String value;

}
