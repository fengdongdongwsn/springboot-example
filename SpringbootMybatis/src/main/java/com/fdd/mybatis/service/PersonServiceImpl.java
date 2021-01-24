package com.fdd.mybatis.service;

import com.fdd.mybatis.bean.Person;
import com.fdd.mybatis.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:PersonServiceImpl
 * PackageName:com.fdd.mybatis.service
 * Date:2019/12/13 16:00
 * Author:冯冬冬，3049352171@qq.com
 * Description:
 */
@Service
public class PersonServiceImpl implements  PersonService {

    @Autowired
    private PersonMapper personMapper;


    @Override
    public int insertPerson(Person person) {
        return personMapper.insert(person);
    }

    @Override
    public int deleteByPersonId(Integer id) {
        return personMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateByPersonId(Integer id) {
        return personMapper.updateByPrimaryKey(id);
    }

    @Override
    public Person selectByPersonId(Integer id) {
        return personMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Person> selectAllPerson() {
        return personMapper.selectAllPerson();
    }
}
