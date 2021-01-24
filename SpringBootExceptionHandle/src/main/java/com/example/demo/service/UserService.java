package com.example.demo.service;

import com.example.demo.dao.User;
import org.springframework.stereotype.Service;

/**
 * ClassName:UserService
 * PackageName:com.example.demo
 * Date:2021/1/5 11:44
 * Author:冯冬冬，3049352171@qq.com
 * Description:
 */
@Service
public class UserService {
    public User findOne(int id){
        //本来应该向数据库查询User，但是数据库没有
        return null;
    }
}
