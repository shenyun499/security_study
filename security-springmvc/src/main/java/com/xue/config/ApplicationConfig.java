package com.xue.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * 对应web.xml中ContextLoaderListener的配置
 *
 * @author ：HUANG ZHI XUE
 * @date ：Create in 2020-07-19
 */
@Configuration
@ComponentScan(basePackages = "com.xue", excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = Controller.class)})
public class ApplicationConfig {
    //在此配置除了Controller的其它bean，比如：数据库链接池、事务管理器、业务bean等。
}
