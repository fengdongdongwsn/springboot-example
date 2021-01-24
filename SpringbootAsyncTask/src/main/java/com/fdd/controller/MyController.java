package com.fdd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * ClassName:MyController
 * PackageName:com.fdd
 * Date:2020/1/6 19:40
 * Author:冯冬冬，3049352171@qq.com
 * Description:
 */
@Controller
public class MyController {
    @Autowired
    private MyAsyncTask asyncTask;
    @GetMapping("/test")
    public void test() throws InterruptedException {
        long start = System.currentTimeMillis();
        asyncTask.task1();
        asyncTask.task2();
        asyncTask.task3();
        long end = System.currentTimeMillis();
        System.out.println("任务全部完成，总耗时："+(end-start)+"毫秒");
    }

}
