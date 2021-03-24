package com.fdd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @Author: 愚公要移山
 * @Date: 2021/3/24 10:38
 * @WeChat: fdd15735171890
 */
@RestController
public class ThymeleafController {

    @GetMapping(value = "/thymeleaf")
    public ModelAndView  index(){
        ModelAndView modelAndView = new ModelAndView("/user");
        modelAndView.addObject("admin", "老王");
        return  modelAndView;
    }

}
