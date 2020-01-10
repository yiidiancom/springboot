package com.yiidian.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 自定义全局异常处理类
 * 一点教程网 - www.yiidian.com
 */
@ControllerAdvice
public class GlobalExceptionHandler {
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
