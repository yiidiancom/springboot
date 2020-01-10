package com.yiidian.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ConfigurationProperties注解 - 读取application.properties属性
 * 一点教程网 - www.yiidian.com
 */
//@Controller
@ConfigurationProperties(prefix = "user")
public class Config7Controller {

    //1.3 读取数组/List集合类型
    private List<String> list2;
    public void setList2(List<String> list2) {
        this.list2 = list2;
    }

    @RequestMapping("/config7")
    @ResponseBody
    public List<String> hello(){
        return list2;
    }
}
