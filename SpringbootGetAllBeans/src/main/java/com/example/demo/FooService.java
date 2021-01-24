package com.example.demo;

import org.springframework.stereotype.Service;

/**
 * ClassName:FooService
 * PackageName:com.example.demo
 * Date:2021/1/6 21:25
 * Author:冯冬冬，3049352171@qq.com
 * Description:
 */
@Service
public class FooService {

    public String getHeader() {
        return "Display All Beans";
    }
    public String getBody() {
        return "This is a sample application that displays all beans ";
    }
}