package com.fdd;

import com.fdd.event.MyEvent;
import com.fdd.listener.MyListener;
import com.fdd.service.MyPubilsherService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringbootEventApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(MyPubilsherService.class, MyListener.class);
        applicationContext.refresh();

        MyPubilsherService pubilsherService = applicationContext.getBean(MyPubilsherService.class);
        pubilsherService.publishEvent("我是事件发布器，有事情发生，请注意查收！");
    }

}
