package com.example.demo.form;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

/**
 * @author maqiang
 * @date 2022/1/4  10:01
 */
@Data
public class UserForm {
//    @ApiModelProperty("状态")
//    private String status;

    private Integer pageNo = 1;

    private Integer pageSize  = 10;

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "邮件")
    private String email;

    @ApiModelProperty(value = "创建开始时间")
    private Date createStartTime;

    @ApiModelProperty(value = "创建终止时间")
    private Date createEndTime;

    @ApiModelProperty(value = "时间范围")
    private List<String> timeRange;
}
