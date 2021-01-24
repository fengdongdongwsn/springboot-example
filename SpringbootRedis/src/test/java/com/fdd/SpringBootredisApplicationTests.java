package com.fdd;

import com.fdd.bean.User;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootredisApplicationTests {
    @Autowired
    private RedisTemplate redisTemplate;
    @Test
    public void testObj() throws Exception {
        User user=new User(1, "java的架构师技术栈", "man");
        ValueOperations<String, User> operations=redisTemplate.opsForValue();
        operations.set("fdd2", user);
        boolean exists=redisTemplate.hasKey("fdd2");
        System.out.println("redis是否存在相应的key"+exists);
        User getUser = (User)redisTemplate.opsForValue().get("fdd2");
        System.out.println("从redis数据库获取的user:"+getUser.toString());
    }
}