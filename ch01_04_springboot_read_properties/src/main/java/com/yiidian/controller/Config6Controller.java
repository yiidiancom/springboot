package com.yiidian.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ConfigurationProperties注解 - 读取application.properties属性
 * 一点教程网 - www.yiidian.com
 */
@Controller
@ConfigurationProperties(prefix = "user")
public class Config6Controller {

    //1.2 读取JavaBean类型
    private String nickname;
    private Integer age;

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @RequestMapping("/config6")
    @ResponseBody
    public String hello(){
        return nickname+"-"+age;
    }
}
