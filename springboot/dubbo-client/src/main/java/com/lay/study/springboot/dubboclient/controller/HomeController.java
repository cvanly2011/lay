package com.lay.study.springboot.dubboclient.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lay.study.springboot.dubboapi.DubboService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author yalei.chen
 * @Date 2017/8/17
 * @Since JDK 1.8
 */
@RestController

public class HomeController {

    @Reference(version = "1.0.0")
    public DubboService dubboService;

    @RequestMapping("/index")
    public void index(){

        String echo = dubboService.echo("hello world");

        System.out.println(echo);

    }
}
