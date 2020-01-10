package com.yiidian.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * 控制器
 * 一点教程网 - www.yiidian.com
 */
@Controller
public class HelloController {

    @RequestMapping("/hello1")
    @ResponseBody
    public String hello1(){
        //模拟java.lang.ArithmeticException异常
        int i = 10/0;
        return "欢迎来到一点教程网";
    }

    @RequestMapping("/hello2")
    @ResponseBody
    public String hello2(){
        //模拟java.lang.NullPointerException异常
        String name=null;
        name.trim();
        return "欢迎来到一点教程网";
    }

    // 处理java.lang.ArithmeticException
    @ExceptionHandler(value = { java.lang.ArithmeticException.class })
    @ResponseBody
    public String handlerArithmeticException(Exception e) { // e:该对象包含错误信息
        return "数学运算错误："+e.getMessage();
    }

    // 处理java.lang.NullPointerException
    @ExceptionHandler(value = { java.lang.NullPointerException.class })
    @ResponseBody
    public String handlerNullPointerException(Exception e) { // e:该对象包含错误信息
        return "空指针错误："+e.getMessage();
    }
}
