package com.fdd.config;

import com.fdd.filter.MyFilter1;
import com.fdd.filter.MyFilter2;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean reqResFilter1() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        MyFilter1 myFilter1 = new MyFilter1();
        filterRegistrationBean.setFilter(myFilter1);
        //此时访问 localhost:8080/xxx.a会进行执行

        filterRegistrationBean.addUrlPatterns("*.a");//配置过滤规则
        filterRegistrationBean.setName("MyFilter1");//设置过滤器名称
        //若两个过滤器的匹配规则一样，那么执行优先级高的，数字越小优先级越高
        filterRegistrationBean.setOrder(1);//执行次序
        return filterRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean reqResFilter2() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        MyFilter2 myFilter2 = new MyFilter2();
        filterRegistrationBean.setFilter(myFilter2);
        //此时访问 localhost:8080/xxx.b会进行执行
        filterRegistrationBean.addUrlPatterns("*.b");//配置过滤规则
        filterRegistrationBean.setName("MyFilter2");//设置过滤器名称
        filterRegistrationBean.setOrder(2);//执行次序

        return filterRegistrationBean;
    }

}
