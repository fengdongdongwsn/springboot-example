package com.example.demo.controller;

import io.swagger.annotations.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:HelloController
 * PackageName:com.example.demo.controller
 * Date:2021/1/16 12:53
 * Author:冯冬冬，3049352171@qq.com
 * Description:
 */
@Api("Hello控制类")
@RestController
public class HelloController {
    @ApiOperation("可以指定参数的API")
    @GetMapping("/param")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "用户名", defaultValue = "愚公"),
            @ApiImplicitParam(name = "age", value = "年龄", defaultValue = "20", required = true)
    })
    public String hello(String name,int age){
        return "hello" + name;
    }

    @ApiOperation("可以指定参数的API")
    @PostMapping("/param")
    public String hello1(String name,@ApiParam("年龄") int age){
        return "hello";
    }
}