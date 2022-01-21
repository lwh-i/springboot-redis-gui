package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.form.UserForm;
import com.example.demo.result.PageResult;
import com.example.demo.result.Result;
import com.example.demo.result.Results;
import com.example.demo.service.UserService;
import com.example.demo.vo.UserVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @author maqiang
 * @date 2021/12/29  9:57
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public Result getUser(@RequestParam("id") Integer id) {
        User user = userService.getUser(id);
        return Results.success(user);
    }

//    @GetMapping("/user/{userId}")
//    public Result getUser2(@PathVariable("userId") Integer id) {
//        User user = userService.getUser(id);
//        return Results.success(user);
//    }


    @RequestMapping(value = "/modify")
    public Result modify(@RequestBody UserVo userVo) {
        User user = new User();
        user.setUpdateTime(new Date());
        BeanUtils.copyProperties(userVo, user);
        userService.modifyUser(user);

        return Results.success();
    }


    //通过名称模糊查询，防止sql注入
    //通过邮件精确查询
    //通过创建时间范围查询
    @RequestMapping(value = "/all",method = RequestMethod.POST)
    public Result<PageResult<User>> getAll(@RequestBody UserForm form) {
        //log.info("分页获取用户列表，form: {}", form);
        return userService.findAll(form);
    }

    @RequestMapping("/remove")
    public Result removeUser(@RequestParam("id") Long id) {
        userService.removeUser(id);
        return Results.success();
    }


    @PostMapping("/add")
    public Result add(@RequestBody UserVo userVo) {
        User user = new User();
        BeanUtils.copyProperties(userVo, user);
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        userService.addUser(user);
        return Results.success();
    }



}
