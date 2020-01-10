package com.yiidian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * Spring Boot引导类
 * 一点教程网 - www.yiidian.com
 */
@SpringBootApplication
@ServletComponentScan  //注册Servlet组件
public class MyBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyBootApplication.class,args);
    }

}
