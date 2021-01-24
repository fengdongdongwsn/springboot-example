package com.fdd.mybatis.controller;

import com.fdd.mybatis.bean.Person;
import com.fdd.mybatis.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ClassName:PersonController
 * PackageName:com.fdd.mybatis
 * Date:2019/12/15 19:33
 * Author:冯冬冬，3049352171@qq.com
 * Description:
 */
@RestController
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/add")
    public String students () {

        Person person = new Person();
        person.setId(10);
        person.setName("java的架构师技术栈");
        person.setAge(18);
        int result = personService.insertPerson(person);
        System.out.println("插入的结果是："+result);
        return result+"";
    }

    @RequestMapping(value = "/findAll")
    public String findAll () {
        List<Person> people = personService.selectAllPerson();
        people.stream().forEach(System.out::println);
        return people.toString()+"";
    }
    @RequestMapping(value = "/find")
    public String find (@RequestParam("id") Integer id) {
        Person person = personService.selectByPersonId(id);
        System.out.println(person.toString());
        return person.toString();
    }

    @RequestMapping(value = "/update")
    public String updateById (@RequestParam("id") Integer id,
                              @RequestParam("name") String name,
                              @RequestParam("age") String age) {
        int result = personService.updateByPersonId(id);
        return result+"";
    }

}
