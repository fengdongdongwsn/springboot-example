package com.fdd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * ClassName:MyController
 * PackageName:com.fdd.controller
 * Date:2020/1/12 15:57
 * Author:冯冬冬，3049352171@qq.com
 * Description:
 */

@RestController
public class MyController {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @GetMapping("/test")
    public String deduceGoods() throws Exception{
         String user = UUID.randomUUID().toString();
         Boolean result = stringRedisTemplate.opsForValue().setIfAbsent("lock",user);
         stringRedisTemplate.expire("lock",10, TimeUnit.MILLISECONDS);
         if(!result){
            return "其他人正在秒杀，无法进入";
         }
         try {
             int goods =Integer.parseInt(stringRedisTemplate.opsForValue().get("goods"));
             int realGoods = goods-1;
             if(goods>0){
                 stringRedisTemplate.opsForValue().set("goods",realGoods+"");
                 System.out.println("你已经成功秒杀商品，此时还剩余：" + realGoods + "件");
             }else{
                 System.out.println("商品已经售罄，欢迎下次活动");
             }
         }finally {
             if(user.equals(stringRedisTemplate.opsForValue().get("lock"))){
                 stringRedisTemplate.delete("lock");
             }

         }
        return "success";
    }
}
