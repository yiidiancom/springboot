package com.yiidian.controller;

import com.yiidian.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

/**
 * 控制器
 * 一点教程网 - www.yiidian.com
 */
@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * 跳转到add.html
     * @return
     */
    @RequestMapping("toAdd")
    public String toAdd(User user){
        return "add";
    }

    /**
     * 用户添加
     * BindingResult: 用于封装验证对象（user）里面的验证结果
     */
    @RequestMapping("add")
    public String add(@Valid User user, BindingResult result){
        //如果存在验证错误
        if(result.hasErrors()){
            //返回add.html
            return "add";
        }

        System.out.println("保存用户:"+user);
        return "succ";
    }
}
