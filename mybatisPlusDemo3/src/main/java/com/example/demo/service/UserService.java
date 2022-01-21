package com.example.demo.service;

import com.example.demo.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.form.UserForm;
import com.example.demo.result.PageResult;
import com.example.demo.result.Result;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author James
 * @since 2022-01-04
 */
public interface UserService extends IService<User> {

    void addUser(User user);

    void removeUser(Long id);

    Result<PageResult<User>> findAll(UserForm form);

    void modifyUser(User user);

    User getUser(Integer id);

}
