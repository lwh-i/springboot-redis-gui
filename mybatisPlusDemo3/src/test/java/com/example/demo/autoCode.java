package com.example.demo;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.ArrayList;

/**
 * @author maqiang
 * @date 2021/12/28  1:47
 * 代码生成器
 */

public class autoCode {
    public static void main(String[] args) {
        //创建一个代码自动生成器对象
        AutoGenerator generator = new AutoGenerator();

        //配置策略
        //全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");//获取用户目录
        gc.setOutputDir(projectPath + "/src/main/java");
        gc.setAuthor("James");
        gc.setOpen(false);
        gc.setFileOverride(false);//文件是否覆盖
        gc.setServiceName("%sService");//去掉service的前缀
        gc.setIdType(IdType.ID_WORKER);
        gc.setDateType(DateType.ONLY_DATE);
        gc.setSwagger2(true);
        generator.setGlobalConfig(gc);

        //设置数据源
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/test?useSSL=false&useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT%2B8");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("123456");
        dsc.setDbType(DbType.MYSQL);
        generator.setDataSource(dsc);


        //包的配置
        PackageConfig pc = new PackageConfig();
        pc.setModuleName("blog");
        pc.setParent("com.example.demo");
        pc.setEntity("entity");
        pc.setMapper("mapper");
        pc.setService("service");
        pc.setController("controller");
        generator.setPackageInfo(pc);

        //策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setInclude("shop_info");//设置要映射的表名
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setEntityLombokModel(true);//自动lombok
        strategy.setLogicDeleteFieldName("deleted");//逻辑删除

        //自动填充配置
        TableFill gmt_create = new TableFill("gmt_create", FieldFill.INSERT);//创建时间，自动填充
        TableFill gmt_modify = new TableFill("gmt_modify", FieldFill.INSERT_UPDATE);//修改时间。自动填充
        ArrayList<TableFill> tableFill = new ArrayList<>();
        tableFill.add(gmt_create);
        tableFill.add(gmt_modify);
        strategy.setTableFillList(tableFill);

        //乐观锁
        strategy.setVersionFieldName("version");
        strategy.setRestControllerStyle(true);//restful驼峰命名
        strategy.setControllerMappingHyphenStyle(true);//将参数变为下划线url变为localhost:8080/hello_id_2

        generator.setStrategy(strategy);
        generator.execute();

    }
}
