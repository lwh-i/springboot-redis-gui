package com.example.demo.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * 分页返回
 *
 * @param <T> 泛型标记
 * @author L.cm
 */
@Getter
@Setter
@ApiModel(description = "分页模型")
@NoArgsConstructor
public class PageResult<T> {
    @ApiModelProperty(value = "当前分页，从0开始", required = true)
    private int pageNo;
    @ApiModelProperty(value = "每页大小，缺省系统值", required = true)
    private int pageSize;
    @ApiModelProperty(value = "总页数", required = true)
    private long pageCount;
    @ApiModelProperty(value = "总记录数", required = true)
    private long totalCount;
    @ApiModelProperty(value = "分页数据集合", required = true)
    private List<T> results = new ArrayList<T>();

    public PageResult(int pageNo, int pageSize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }
}
