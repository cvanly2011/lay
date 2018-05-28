package com.lay.study.designmode.proxy;

import java.lang.reflect.Proxy;

/**
 * @author yalei.chen
 * @date 2018/2/13
 * @since JDK 1.8
 */
public class Main {

    public static void main(String[] args) {

        HelloService helloService = new HelloServiceImpl();
        HelloServiceProxy proxy = new HelloServiceProxy(helloService);
//        HelloService service = (HelloService)proxy.bind(new HelloServiceImpl());

        HelloService service = (HelloService)Proxy.newProxyInstance(helloService.getClass().getClassLoader(), helloService.getClass().getInterfaces(), proxy);
        service.sayHello();

        service.sysBye();
    }
}
