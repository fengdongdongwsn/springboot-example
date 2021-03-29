package com.fdd.dao;

import com.fdd.entity.SpringBootJDBC;

import java.util.List;

/**
 * @Author: 愚公要移山
 * @Date: 2021/3/29 10:58
 * @WeChat: fdd15735171890
 */
public interface ISpringBootJDBCDao {

    int add(SpringBootJDBC springBootJDBC);

    int update(SpringBootJDBC springBootJDBC);

    int delete(int id);

    SpringBootJDBC findSpringBootJDBCById(int id);

    List<SpringBootJDBC> findSpringBootJDBCList();

}
