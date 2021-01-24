package com.example.demo.controller;

import org.springframework.boot.autoconfigure.web.servlet.error.AbstractErrorController;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

/**
 * ClassName:MyErrorController
 * PackageName:com.example.demo.controller
 * Date:2021/1/6 15:05
 * Author:冯冬冬，3049352171@qq.com
 * Description:
 */
@Controller
public class MyErrorController extends AbstractErrorController {

    public MyErrorController(ErrorAttributes errorAttributes) {
        super(errorAttributes);
    }

    @RequestMapping("/handle")
    public String handleError(HttpServletRequest request) {
        HttpStatus status = this.getStatus(request);
        if (status != null) {
            Integer statusCode = Integer.valueOf(status.toString());
            if(statusCode == HttpStatus.NOT_FOUND.value()) {
                return "/error/404";
            }
            else if(statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
                System.out.println(statusCode);
                return "/error/500";
            }
        }
        if(status==null)System.out.println("状态为空");
        return "common";
    }

    @Override
    public String getErrorPath() {
        return null;
    }
}
