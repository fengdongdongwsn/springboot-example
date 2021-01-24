package com.fdd.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.fdd.mybatis.mapper")
@EnableTransactionManagement
public class SpringBootMybatisApplication {
    public static void main(String[] args) {

        SpringApplication.run(SpringBootMybatisApplication.class, args);
    }

}
