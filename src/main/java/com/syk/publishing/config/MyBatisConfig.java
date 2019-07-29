package com.syk.publishing.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
* @author: syk
* @date: 2019-07-04
* @description: MyBatis Config类
**/

@Configuration
@MapperScan("com.syk.bar.mbg.mapper")
public class MyBatisConfig {
}
