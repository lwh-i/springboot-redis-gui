package com.example.demo.config;

import com.baomidou.mybatisplus.core.injector.ISqlInjector;
import com.baomidou.mybatisplus.extension.injector.LogicSqlInjector;
import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.beans.PersistenceDelegate;

/**
 * @author maqiang
 * @date 2021/12/28  0:12
 */
//自动管理事务注解
@EnableTransactionManagement
@MapperScan("com.example.demo.mapper")
@Configuration
public class MybatisPlusConfig {

    //注册乐观锁插件
    @Bean
    public OptimisticLockerInterceptor optimisticLockerInterceptor() {
        return new OptimisticLockerInterceptor();
    }

    //分页插件
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        //未做设置，直接将默认值返回
        return new PaginationInterceptor();

    }

    //逻辑删除组件
    @Bean
    public ISqlInjector sqlInjector() {
        return new LogicSqlInjector();
    }


    //SQL执行效率插件
    @Bean
    @Profile({"dev", "test"})//设置dev test环境
    public PerformanceInterceptor performanceInterceptor() {
        PerformanceInterceptor performanceInterceptor = new PerformanceInterceptor();
        performanceInterceptor.setMaxTime(100);//设置sql执行的最大时间，如果超过设置的时间则不执行
        performanceInterceptor.setFormat(true);//是否格式化代码
        return performanceInterceptor;
    }
}
