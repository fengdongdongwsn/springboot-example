package com.fdd.controller;

import com.fdd.bean.Person;
import com.fdd.mapper1.PersonMapper;
import com.fdd.mapper2.UserMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ClassName:MyController
 * PackageName:com.fdd.controller
 * Date:2020/1/7 10:01
 * Author:冯冬冬，3049352171@qq.com
 * Description:
 */
@RestController
public class MyController {

    @Autowired
    private PersonMapper personService;

    @Autowired
    private UserMapper personService2;


    @GetMapping("/add")
    public String test1(){
        Person person = new Person();
        person.setId(14);
        person.setName("java的架构师技术栈");
        person.setAge(18);
        int result = personService.insert(person);
        int result2 = personService2.insert(person);
        System.out.println("插入的结果是："+result+"  "+result2);
        return "插入的结果是："+result+"  "+result2;
    }

    @GetMapping("/find")
    public void test2(){
        List<Person> list = personService.selectAllPerson();
        for (Person person:list ) {
            System.out.println(person.toString());
        }
        System.out.println("====数据库2结果======");
        List<Person> list1 = personService2.selectAllPerson();
        for (Person person1:list1 ) {
            System.out.println(person1.toString());
        }
    }
}
