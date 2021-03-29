package com.fdd.dao.impl;

import com.fdd.dao.ISpringBootJDBCDao;
import com.fdd.entity.SpringBootJDBC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: 愚公要移山
 * @Date: 2021/3/29 11:00
 * @WeChat: fdd15735171890
 */
@Repository
public class SpringBootJDBCDaoImpl implements ISpringBootJDBCDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int add(SpringBootJDBC springBootJDBC) {
        String sql = "insert into springbootjdbc(name, age) values(?,?)";
        return jdbcTemplate.update(sql,springBootJDBC.getName(),springBootJDBC.getAge());
    }

    @Override
    public int update(SpringBootJDBC springBootJDBC) {
        String sql = "update springbootjdbc SET name=? ,age=? WHERE id=?";
        return jdbcTemplate.update(sql,springBootJDBC.getName(),springBootJDBC.getAge(),springBootJDBC.getId());
    }

    @Override
    public int delete(int id) {
        return jdbcTemplate.update("delete from TABLE springbootjdbc where id=?",id);
    }

    @Override
    public SpringBootJDBC findSpringBootJDBCById(int id) {
        List<SpringBootJDBC> list = jdbcTemplate.query("select * from springbootjdbc where id = ?", new Object[]{id}, new BeanPropertyRowMapper(SpringBootJDBC.class));
        if(list!=null && list.size()>0){
            SpringBootJDBC account = list.get(0);
            return account;
        }else{
            return null;
        }
    }

    @Override
    public List<SpringBootJDBC> findSpringBootJDBCList() {
        List<SpringBootJDBC> list = jdbcTemplate.query("select * from springbootjdbc", new Object[]{}, new BeanPropertyRowMapper(SpringBootJDBC.class));
        if(list!=null && list.size()>0){
            return list;
        }else{
            return null;
        }
    }
}
