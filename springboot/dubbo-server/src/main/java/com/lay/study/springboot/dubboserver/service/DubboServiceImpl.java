package com.lay.study.springboot.dubboserver.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lay.study.springboot.dubboapi.DubboService;

/**
 * @Author yalei.chen
 * @Date 2017/8/17
 * @Since JDK 1.8
 */
@Service(interfaceClass=DubboService.class,version = "1.0.0")
public class DubboServiceImpl implements DubboService {

    @Override
    public String echo(String str) {
        System.out.println(str);
        return "exec:"+str;
    }
}
