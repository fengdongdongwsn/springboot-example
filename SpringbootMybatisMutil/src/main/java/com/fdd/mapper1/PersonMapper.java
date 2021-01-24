package com.fdd.mapper1;

import com.fdd.bean.Person;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PersonMapper {
    //增加一个Person
    @Insert("insert into person(id,name,age)values(#{id},#{name},#{age})")
    int insert(Person person);
    //删除一个Person
    @Delete("delete from person where id = #{id}")
    int deleteByPrimaryKey(Integer id);
    //更改一个Person
    @Update("update person set name =#{name},age=#{age} where id=#{id}")
    int updateByPrimaryKey(Integer id);
    //查询一个Person
    @Select("select id,name ,age from person where id = #{id}")
    Person selectByPrimaryKey(Integer id);
    //查询所有的Person
    @Select("select id,name,age from person")
    List<Person> selectAllPerson();
}