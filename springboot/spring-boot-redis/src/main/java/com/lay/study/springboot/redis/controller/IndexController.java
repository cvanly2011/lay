package com.lay.study.springboot.redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * Create by yalei.chen on 2017/6/15
 */
@RestController
public class IndexController {

    @Autowired
    @Qualifier("masterRedisTemplate")
    private StringRedisTemplate redisTemplate;

    @Autowired
    @Qualifier("slaveOneRedisTemplate")
    private StringRedisTemplate redisSlaveOneTemplate;

    @GetMapping("/set")
    public boolean set(
            @RequestParam(value = "key") String key,
            @RequestParam(value = "value") String vlaue) {

        redisTemplate.opsForValue().set(key,vlaue,1, TimeUnit.HOURS);

        return true;

    }

    @GetMapping("/get")
    public String get(
            @RequestParam(value = "key") String key) {

        String value = redisTemplate.opsForValue().get(key);
        return value;

    }


    @GetMapping("/slaveSet")
    public boolean slaveSet(
            @RequestParam(value = "key") String key,
            @RequestParam(value = "value") String vlaue) {

        redisSlaveOneTemplate.opsForValue().set(key,vlaue,1, TimeUnit.HOURS);

        return true;

    }

    @GetMapping("/slaveGet")
    public String slaveGet(
            @RequestParam(value = "key") String key) {

        return redisSlaveOneTemplate.opsForValue().get(key);

    }
}
