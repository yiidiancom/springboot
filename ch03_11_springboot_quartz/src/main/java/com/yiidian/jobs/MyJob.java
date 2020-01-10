package com.yiidian.jobs;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Quartz的任务类
 * 一点教程网 - www.yiidian.com
 */
public class MyJob {

    /**
     * 任务方法
     */
    public void task(){
        System.out.println("任务被触发，当前时间为："+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }
}
