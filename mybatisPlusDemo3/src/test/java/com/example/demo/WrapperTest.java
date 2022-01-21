package com.example.demo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

/**
 * @author maqiang
 * @date 2021/12/28  1:20
 */
@SpringBootTest
public class WrapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void test() {
        //查询name不为NULL，并且邮箱不为空，年龄大于12的用户
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper
                .isNotNull("name")
                .isNotNull("email")
                .ge("age", 12);//年龄大于12的用户，ge是大于的意思
        userMapper.selectList(wrapper).forEach(System.out::println);
    }


    @Test
    void test1() {
        //根据姓名查询
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("name", "Tom");//eq是相等的意思
        User user = userMapper.selectOne(wrapper);
        System.out.println(user);
    }

    @Test
    void test2() {
        //年龄在20-30岁之间的用户
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.between("age", 20, 30);
        Integer count = userMapper.selectCount(wrapper);
        System.out.println(count);
    }

    @Test
    void test3() {
        //模糊查询
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper
                .notLike("name", "e")//名字中不包含e的
                .likeRight("email", "t");//邮箱号以t开头==t%
        List<Map<String, Object>> maps = userMapper.selectMaps(wrapper);
        maps.forEach(System.out::println);

    }

    @Test
    void test4() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        //通过id进行排序
        wrapper.orderByAsc("id");
        List<User> users = userMapper.selectList(wrapper);
        users.forEach(System.out::println);
    }
}
