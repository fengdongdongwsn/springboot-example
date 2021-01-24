package com.example.demo.controller;

import com.example.demo.dao.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:UserResource
 * PackageName:com.example.demo.exception
 * Date:2021/1/5 11:43
 * Author:冯冬冬，3049352171@qq.com
 * Description:
 */
@RestController
public class UserController {
    @Autowired
    private UserService service;
    @GetMapping("/users/{id}")
    public User retriveUser(@PathVariable int id) throws UserNotFoundException {
        User user= service.findOne(id);
        if(user==null)
            throw new UserNotFoundException("id: "+ id);
        return user;
    }
}
