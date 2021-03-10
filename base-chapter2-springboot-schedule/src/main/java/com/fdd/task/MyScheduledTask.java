package com.fdd.task;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
//component标签也可以
public class MyScheduledTask {

    @Scheduled(cron = "0 0 0 * * ?")
    public void scheduledTask1() {
        System.out.println("定时任务1");
    }

    @Scheduled(initialDelay = 1000 * 2, fixedDelay = 1000 * 5)
    public void scheduledTask2() {
        System.out.println("任务2执行");
    }

    @Scheduled(initialDelay = 1000 * 2, fixedRate = 1000 * 5)
    public void scheduledTask3() {
        System.out.println("任务3执行");
    }
}
