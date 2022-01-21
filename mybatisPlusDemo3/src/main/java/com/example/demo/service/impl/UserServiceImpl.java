package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.User;
import com.example.demo.form.UserForm;
import com.example.demo.mapper.UserMapper;
import com.example.demo.result.PageResult;
import com.example.demo.result.Result;
import com.example.demo.result.Results;
import com.example.demo.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author James
 * @since 2022-01-04
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void addUser(User user) {
        super.save(user);
    }

    @Override
    public void removeUser(Long id) {
        super.removeById(id);
    }

    @Override
    public Result<PageResult<User>> findAll(UserForm form) {

        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();

        queryWrapper.like(StringUtils.isNotBlank(form.getName()), User::getName, form.getName())
                .eq(StringUtils.isNotBlank(form.getEmail()), User::getEmail, form.getEmail())
                .between((form.getCreateStartTime()!= null && form.getCreateEndTime() != null), User::getCreateTime, form.getCreateStartTime(), form.getCreateEndTime());

        Page<User> page = new Page<>(form.getPageNo(), form.getPageSize());
        super.page(page, queryWrapper);

        List<User> records = page.getRecords();
        PageResult<User> result = new PageResult<>();
        result.setPageNo(form.getPageNo());
        result.setPageSize(form.getPageSize());
        result.setResults(records);
        result.setTotalCount(page.getTotal());

        return Results.success(result);
    }


    @Override
    public void modifyUser(User user) {

        super.updateById(user);

    }

    @Override
    public User getUser(Integer id) {
        return super.getById(id);
    }
}
