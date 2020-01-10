package com.yiidian.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Value注解 - 读取application.yml属性
 * 一点教程网 - www.yiidian.com
 */
//@Controller
public class Config2Controller {

    //1.2 读取JavaBean类型
    @Value("${user.nickname}")
    private String nickname;
    @Value("${user.age}")
    private Integer age;

    @RequestMapping("/config2")
    @ResponseBody
    public String hello(){
        return nickname+"-"+age;
    }
}
