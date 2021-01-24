package com.fdd.mybatis.bean;

import org.apache.ibatis.annotations.Mapper;

import java.io.Serializable;

/**
 * ClassName:Person
 * PackageName:com.fdd.mybatis.dao
 * Date:2019/12/13 15:35
 * Author:冯冬冬，3049352171@qq.com
 * Description:
 */
@Mapper
public class Person implements Serializable {

    private Integer id ;

    private String name;

    private Integer  age;

    public Person() {
    }

    public Person(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
