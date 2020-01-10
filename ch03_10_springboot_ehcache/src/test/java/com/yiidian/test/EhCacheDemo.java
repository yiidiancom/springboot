package com.yiidian.test;

import com.yiidian.MyBootApplication;
import com.yiidian.service.CustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *  SpringBoot整合EhCache
 * 一点教程网 - www.yiidian.com
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MyBootApplication.class)
public class EhCacheDemo {
    @Autowired
    private CustomerService customerService;

    @Test
    public void test1(){
        //查询第一次
        System.out.println(customerService.findById(1));
        //查询第二次
        System.out.println(customerService.findById(1));
    }
}
