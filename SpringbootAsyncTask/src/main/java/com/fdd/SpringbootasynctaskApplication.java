package com.fdd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringbootasynctaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootasynctaskApplication.class, args);
    }

}
