package com.yiidian.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @ConfigurationProperties注解 - 读取application.properties属性
 * 一点教程网 - www.yiidian.com
 */
@Controller
@ConfigurationProperties(prefix = "user")
public class Config8Controller {

    //1.4 读取Map集合类型
    private Map<String,Object> map2;
    public void setMap2(Map<String, Object> map2) {
        this.map2 = map2;
    }

    @RequestMapping("/config8")
    @ResponseBody
    public Map<String,Object> hello(){
        return map2;
    }
}
