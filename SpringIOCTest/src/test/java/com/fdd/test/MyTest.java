package com.fdd.test;

import com.fdd.bean.Benz;
import com.fdd.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName:Test
 * PackageName:com.fdd.test
 * Date:2020/1/6 10:46
 * Author:冯冬冬，3049352171@qq.com
 * Description:
 */
public class MyTest {
    @Test
    public void test1(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Spring.xml");
        Benz benz = context.getBean("bean1", Benz.class);
        User user = new User(benz);
        user.goHome();
        user.goSchool();
    }
}
