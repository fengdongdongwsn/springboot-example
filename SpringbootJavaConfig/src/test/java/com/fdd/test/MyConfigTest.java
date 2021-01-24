package com.fdd.test;

import com.fdd.bean.User;
import com.fdd.config.UserConfig;
import com.fdd.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * ClassName:MyConfigTest
 * PackageName:com.fdd.test
 * Date:2020/1/15 10:25
 * Author:冯冬冬，3049352171@qq.com
 * Description:
 */
public class MyConfigTest {
    @Test
    public  void test(){
        //获取java配置类
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(UserConfig.class);
        //获取ioc容器中的对象
        UserService userService = (UserService) context.getBean("userService");
        //调用方法
        List<User> query = userService.queryAll();
        for (User user:query) {
            System.out.println(user);
        }
    }
}
