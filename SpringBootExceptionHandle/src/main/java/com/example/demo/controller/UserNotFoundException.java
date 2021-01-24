package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * ClassName:UserNotFoundException
 * PackageName:com.example.demo.controller
 * Date:2021/1/5 11:48
 * Author:冯冬冬，3049352171@qq.com
 * Description:
 */
@ResponseStatus(HttpStatus.NOT_MODIFIED)
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message){
        super(message);
        System.out.println("异常信息是："+message);
    }
}
