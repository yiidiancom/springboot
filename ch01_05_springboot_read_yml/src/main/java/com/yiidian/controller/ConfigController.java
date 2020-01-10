package com.yiidian.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Value注解 - 读取application.yml
 * 一点教程网 - www.yiidian.com
 */
//@Controller
public class ConfigController {

    //1.1 读取基本类型
    @Value("${nickname}")
    private String nickname;
    @Value("${age}")
    private Integer age;

    @RequestMapping("/config")
    @ResponseBody
    public String hello(){
        return nickname+"-"+age;
    }
}
