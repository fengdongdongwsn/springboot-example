package com.fdd.mybatis.test;

import com.fdd.mybatis.bean.Person;
import com.fdd.mybatis.service.PersonServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * ClassName:PersonTest
 * PackageName:com.fdd.mybatis.test
 * Date:2019/12/13 16:05
 * Author:冯冬冬，3049352171@qq.com
 * Description:
 */
public class PersonTest {

    @Autowired
    private PersonServiceImpl personService;



    @Before
    public void test0(){

    }

    @Test
    public void test1(){
        Person person = new Person();
        person.setId(10);
        person.setName("java的架构师技术栈");
        person.setAge(18);
        int result = personService.insertPerson(person);
        System.out.println("插入的结果是："+result);
    }

    @Test
    public void test2(){
        List<Person> list = personService.selectAllPerson();
        for (Person person:list ) {
            System.out.println(person.toString());
        }

    }
}
