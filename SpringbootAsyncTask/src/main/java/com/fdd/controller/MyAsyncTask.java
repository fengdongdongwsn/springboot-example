package com.fdd.controller;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

/**
 * ClassName:MyAsyncTask
 * PackageName:com.fdd.controller
 * Date:2020/1/6 19:33
 * Author:冯冬冬，3049352171@qq.com
 * Description:
 */
@Component
public class MyAsyncTask {
    @Async
    public void task1() throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread.sleep(1000);
        long end = System.currentTimeMillis();
        System.out.println("任务一耗时："+ (end-start)+"毫秒");
    }
//    @Async
    public void task2() throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread.sleep(2000);
        long end = System.currentTimeMillis();
        System.out.println("任务二耗时："+ (end-start)+"毫秒");
    }
    //任务3，我们不添加注解，便于验证
    public void task3() throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread.sleep(3000);
        long end = System.currentTimeMillis();
        System.out.println("任务三耗时："+ (end-start)+"毫秒");
    }

}
