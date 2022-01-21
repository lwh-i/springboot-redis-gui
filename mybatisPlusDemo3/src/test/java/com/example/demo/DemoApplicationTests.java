package com.example.demo;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    //继承了baseMapper，所有的方法都是父类的，自己也可以自定义
    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {

        User user = userMapper.selectById(1);



        System.out.println(user);

        //查询全部用户
//        List<User> users =  userMapper.selectList(null);
//        users.forEach(System.out::println);
    }

    //插入测试，他的主键没设置的话使用的是雪花算法，生成一个id
    @Test
    public void test() {
//        User user = new User();
//        user.setName("JAMES");
//        user.setAge(37);
//        user.setEmail("752365743@qq.com");
//        int result = userMapper.insert(user);
//        System.out.println(result);
    }


    //测试更新
    @Test
    public void test1() {
//        User user = new User();
//        user.setId(1L);
//        user.setName("firefox");
//        int i = userMapper.updateById(user);
//        System.out.println(i);
    }


    //测试乐观锁,多个线程对同一个数据进行修改的时候，不会发生线程安全问题
    @Test
    public void test2() {
        //查询用户
//        User user = userMapper.selectById(1L);
//        user.setName("king");
//        userMapper.updateById(user);
    }

    //查询操作
    @Test
    public void test3() {
        User user = userMapper.selectById(1l);
        System.out.println(user);
    }

    //批量查询
    @Test
    public void test4(){
        List<User> users = userMapper.selectBatchIds(Arrays.asList(1, 2, 3));
        users.forEach(System.out::println);
    }

    //条件查询,使用map进行查询
    @Test
    public void test5() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", "Tom");
        map.put("age", 19);

        List<User> users = userMapper.selectByMap(map);
        users.forEach(System.out::println);
    }

    //分页查询,配置拦截器
    @Test
    public void test6() {
        /**
         * current:当前页
         * size:每页的大小
         */
        Page<User> page = new Page<>(1, 5);
        userMapper.selectPage(page, null);

        page.getRecords().forEach(System.out::println);

    }

    //删除操作
    @Test
    public void test7() {
        userMapper.deleteById(1l);
    }

    //批量删除
    @Test
    public void test8() {
        userMapper.deleteBatchIds(Arrays.asList(2l,3l));
    }

    //通过map删除
    @Test
    public void test9() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", "Tom");
        userMapper.deleteByMap(map);
    }
}
