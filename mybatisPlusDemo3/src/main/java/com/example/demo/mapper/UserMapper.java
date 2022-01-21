package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.model.UserExample;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author James
 * @since 2022-01-04
 */
public interface UserMapper extends BaseMapper<User> {
    List<User> findAll();



//    List<User> selectByExample(UserExample example);

}
