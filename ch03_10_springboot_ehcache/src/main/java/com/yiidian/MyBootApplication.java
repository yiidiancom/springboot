package com.yiidian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

/**
 * Spring Boot引导类
 * 一点教程网 - www.yiidian.com
 */
@SpringBootApplication
@EnableCaching // 开启缓存
public class MyBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyBootApplication.class,args);
    }

}
