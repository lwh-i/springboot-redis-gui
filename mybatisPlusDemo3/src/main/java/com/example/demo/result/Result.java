package com.example.demo.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.lang.Nullable;

import java.io.Serializable;

/**
 * @author maqiang
 * @date 2021/12/31  14:55
 */

@Getter
@Setter
@ToString
@ApiModel(description = "数据返回模型")
public class Result<T> implements Serializable {
    private static final long serialVersionUID = -1160662278280275915L;

    @ApiModelProperty(value = "是否成功", required = true)
    private boolean success;
    @ApiModelProperty(value = "code码", required = true)
    private int code;
    @ApiModelProperty("数据")
    @Nullable
    private T data;
    @ApiModelProperty(value = "消息", required = true)
    @Nullable
    private String msg;
}
