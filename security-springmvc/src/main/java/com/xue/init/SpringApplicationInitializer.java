package com.xue.init;

import com.xue.config.ApplicationConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import com.xue.config.WebConfig;

/**
 * spring容器初始化类
 * 1、SpringApplicationInitializer相当于web.xml，使用了servlet3.0开发则不需要再定义web.xml
 * 2、ApplicationConfig.class对应以下配置的application-context.xml
 * 3、WebConfig.class对应以下配置的spring- mvc.xml
 *
 * @author ：HUANG ZHI XUE
 * @date ：Create in 2020-07-19
 */
public class SpringApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] {ApplicationConfig.class};//指定rootContext的配置类
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebConfig.class};// 指定servletContext的配置类
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
