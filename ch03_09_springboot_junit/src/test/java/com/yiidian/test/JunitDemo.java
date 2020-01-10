package com.yiidian.test;

import com.yiidian.MyBootApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *  单元测试类
 * 一点教程网 - www.yiidian.com
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MyBootApplication.class)
public class JunitDemo {

    @Test
    public void test1(){
        System.out.println("一点教程网-SpringBoot整合Junit");
    }
}
