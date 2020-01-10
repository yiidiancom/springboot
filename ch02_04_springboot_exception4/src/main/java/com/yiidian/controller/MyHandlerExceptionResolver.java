package com.yiidian.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 自定义异常处理类
 * 一点教程网 - www.yiidian.com
 */
@Configuration
public class MyHandlerExceptionResolver implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2,
                                         Exception e) {
        ModelAndView mv = new ModelAndView();
        //判断不同异常类型，做不同处理
        if(e instanceof ArithmeticException){
            mv.setViewName("error1");
        }

        if(e instanceof NullPointerException){
            mv.setViewName("error2");
        }

        mv.addObject("error", e.toString());
        return mv;
    }

}
