package com.lay.study.springboot.restdocc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

/**
 * @Author yalei.chen
 * @Date 2017/8/15
 * @Since JDK 1.8
 */
@RestController
public class HomeController {

    @GetMapping("/")
    public Map<String, Object> greeting() {
        return Collections.singletonMap("message", "Hello World");
    }
}
