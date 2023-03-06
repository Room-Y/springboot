package com.itheima;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
class Springboot16RedisApplicationTests {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Test
    void set(){
        ValueOperations ops = redisTemplate.opsForValue();
        ops.set("age", 41);
    }

    @Test
    void get(){
        ValueOperations ops = redisTemplate.opsForValue();
        Object o = ops.get("name");
        System.out.println(o);
    }

    @Test
    void hset(){
        HashOperations ops = redisTemplate.opsForHash();
        ops.put("info", "a", "aa");
    }

    @Test
    void hget(){
        HashOperations ops = redisTemplate.opsForHash();
        Object o = ops.get("info", "a");
        System.out.println(o);
    }
}
