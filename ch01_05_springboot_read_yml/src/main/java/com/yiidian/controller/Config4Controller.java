package com.yiidian.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @Value注解 - 读取application.properties属性
 * 一点教程网 - www.yiidian.com
 */
//@Controller
public class Config4Controller {

    //1.4 读取Map集合类型
    @Value("#{${user.map}}")
    private Map<String,Object> map;

    @RequestMapping("/config4")
    @ResponseBody
    public Map<String,Object> hello(){
        return map;
    }
}
