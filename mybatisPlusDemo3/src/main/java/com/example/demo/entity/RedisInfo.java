package com.example.demo.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @author maqiang
 * @create 2022-01-20 17:50
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="redis对象", description="")
public class RedisInfo {

    private static final long serialVersionUID = 1L;
    //类型
    private String type;
    //操作
    private String operation;
    //键
    private String key;
    //值
    private String value;


}
