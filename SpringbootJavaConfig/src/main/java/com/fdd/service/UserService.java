package com.fdd.service;

import com.fdd.bean.User;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:UserService
 * PackageName:com.fdd.service
 * Date:2020/1/15 10:02
 * Author:冯冬冬，3049352171@qq.com
 * Description:
 */
public class UserService {
    public List<User> queryAll(){
        //创建一个新的list集合，用来承接数据，充当返回值
        List<User> users=new ArrayList<User>();
        //添加数据name,pass
        for (int i=0;i<10;i++){
            User user = new User();
            user.setId(i);
            user.setName("name==>"+i);
            user.setPassword("pass==>"+i);
            users.add(user);
        }
        return users;
    }

}
