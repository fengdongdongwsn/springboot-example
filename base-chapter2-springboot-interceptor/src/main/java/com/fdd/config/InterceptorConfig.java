package com.fdd.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author: 愚公要移山
 * @Date: 2021/3/15 11:07
 * @WeChat: fdd15735171890
 */
@Configuration//定义此类为配置类（即之前的xml配置文件）
public class InterceptorConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //需要拦截的路径
        String[] addPathPatterns = {"/fdd/**","/其他路径"};
        //不需要拦截的路径
        String[] excludePathPatterns = {"/dd/error","/dd/login"};
        //第三步：注册到拦截器中即可
        registry.addInterceptor(new MyInterceptor()).addPathPatterns(addPathPatterns).excludePathPatterns(excludePathPatterns);
    }
}
