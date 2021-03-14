package com.fdd.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MyAsyncTask {
    //一个注解即可表示，本项目使用controller触发异步任务
    @Async
    public void task1() throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread.sleep(1000);
        long end = System.currentTimeMillis();
        System.out.println("任务一耗时：" + (end - start) + "毫秒");
    }

    @Async
    public void task2() throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread.sleep(2000);
        long end = System.currentTimeMillis();
        System.out.println("任务二耗时：" + (end - start) + "毫秒");
    }
}
