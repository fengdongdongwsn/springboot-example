package com.fdd.mybatis.service;

import com.fdd.mybatis.bean.Person;

import java.util.List;

/**
 * ClassName:PersonService
 * PackageName:com.fdd.mybatis.service
 * Date:2019/12/13 15:59
 * Author:冯冬冬，3049352171@qq.com
 * Description:
 */

public interface PersonService {
    //增加一个Person
    int insertPerson(Person person);
    //删除一个Person
    int deleteByPersonId(Integer id);
    //更改一个Person
    int updateByPersonId(Integer id);
    //查询一个Person
    Person selectByPersonId(Integer id);
    //查询所有的Person
    List<Person> selectAllPerson();
}
