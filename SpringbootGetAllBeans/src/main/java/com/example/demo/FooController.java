package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * ClassName:FooController
 * PackageName:com.example.demo
 * Date:2021/1/6 21:25
 * Author:冯冬冬，3049352171@qq.com
 * Description:
 */
@Controller
public class FooController {
    @Autowired
    private FooService fooService;
    @RequestMapping(value="/displayallbeans")
    public String getHeaderAndBody(Map model){
        model.put("header", fooService.getHeader());
        model.put("message", fooService.getBody());
        return "displayallbeans";
    }
}
