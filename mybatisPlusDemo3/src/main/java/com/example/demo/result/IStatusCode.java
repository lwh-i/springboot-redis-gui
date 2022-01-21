package com.example.demo.result;

import java.io.Serializable;

/**
 * @author maqiang
 * @date 2021/12/31  15:10
 */
public interface IStatusCode extends Serializable {
    /**
     * 获取 code 码
     * @return code码
     */
    int getCode();

    /**
     * 获取描述
     * @return desc描述
     */
    String getDesc();
}
