package com.fdd.config;

import com.fdd.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName:UserConfig
 * PackageName:com.fdd.config
 * Date:2020/1/15 10:20
 * Author:冯冬冬，3049352171@qq.com
 * Description:
 */
@Configuration
public class UserConfig {
    @Bean
    public UserService userService(){
        return new UserService();
    }
}
