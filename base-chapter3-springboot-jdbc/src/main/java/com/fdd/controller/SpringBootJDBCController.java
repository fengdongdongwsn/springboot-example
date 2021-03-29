package com.fdd.controller;

import com.fdd.dao.ISpringBootJDBCDao;
import com.fdd.entity.SpringBootJDBC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: 愚公要移山
 * @Date: 2021/3/29 10:57
 * @WeChat: fdd15735171890
 */
@RestController
public class SpringBootJDBCController {

    @Autowired
    ISpringBootJDBCDao iSpringBootJDBCDao;

    @GetMapping(value = "/list")
    public List<SpringBootJDBC> getAccounts(){
        return iSpringBootJDBCDao.findSpringBootJDBCList();
    }

    @GetMapping(value = "/{id}")
    public  SpringBootJDBC getAccountById(@PathVariable("id") int id){
        return iSpringBootJDBCDao.findSpringBootJDBCById(id);
    }

    @PutMapping(value = "/{id}")
    public  String updateAccount(@PathVariable("id")int id ,
                                 @RequestParam(value = "name",required = true)String name,
                                 @RequestParam(value = "age" ,required = true)int age){
        SpringBootJDBC springBootJDBC = new SpringBootJDBC(id,name,age);

        int t=iSpringBootJDBCDao.update(springBootJDBC);
        if(t==1){
            return springBootJDBC.toString();
        }else {
            return "fail";
        }
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public  String postAccount( @RequestParam(value = "name")String name,
                                @RequestParam(value = "age" )int age) {
        SpringBootJDBC springBootJDBC = new SpringBootJDBC();
        springBootJDBC.setAge(age);
        springBootJDBC.setName(name);
        int t = iSpringBootJDBCDao.add(springBootJDBC);
        if (t == 1) {
            return springBootJDBC.toString();
        } else {
            return "fail";
        }
    }
}
