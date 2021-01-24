package com.fdd.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * ClassName:WebSocketConfig
 * PackageName:com.fdd.config
 * Date:2019/12/26 14:08
 * Author:冯冬冬，3049352171@qq.com
 * Description:
 */
@Configuration
public class WebSocketConfig {
    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }
}
