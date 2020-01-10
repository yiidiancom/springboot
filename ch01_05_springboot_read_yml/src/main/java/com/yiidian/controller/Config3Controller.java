package com.yiidian.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Value注解 - 读取application.yml属性
 * 一点教程网 - www.yiidian.com
 */
//@Controller
public class Config3Controller {

    //1.3 读取数组/List集合类型
    @Value("#{'${user.list}'.split(',')}")
    private List<String> list;

    @RequestMapping("/config3")
    @ResponseBody
    public List<String> hello(){
        return list;
    }
}
