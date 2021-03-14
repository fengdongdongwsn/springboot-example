package com.fdd.mapper;

import com.fdd.bean.MybatisAnnotion;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MybatisAnnotionMapper {

    //增加一个数据源
    @Insert("insert into mybatisannotion(id,name)values(#{id},#{name})")
    int insertMybatisAnnotion(MybatisAnnotion mybatisAnnotion);

    //删除一个数据源
    @Delete("delete from mybatisannotion where name = #{name}")
    int deleteMybatisAnnotionByName(String name);

    //更改一个数据源
    @Update("update mybatisannotion set name =#{name} where id=#{id}")
    int updateMybatisAnnotion(MybatisAnnotion adaptSource);

    //查询一个Map
    @Select("select * from mybatisannotion where name = #{name}")
    MybatisAnnotion selectMybatisAnnotionByName(String name);

    //查询所有的Map
    @Select("select * from mybatisannotion")
    List<MybatisAnnotion> selectAllMybatisAnnotion();

}
