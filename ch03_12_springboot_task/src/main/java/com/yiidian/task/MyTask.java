package com.yiidian.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Spring Task任务类
 */
@Component
public class MyTask {

    /**
     * 任务方法
     */
    @Scheduled(cron = "0/5 * * * * ?")
    public void task(){
        System.out.println("任务被触发，当前时间为："+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }
}
