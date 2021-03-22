package com.fdd.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 愚公要移山
 * @Date: 2021/3/22 11:19
 * @WeChat: fdd15735171890
 */

@RestController
public class LogController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/hello")
    public String hello(){
        logger.info("hello world");
        return "Hello,World!";
    }


}
